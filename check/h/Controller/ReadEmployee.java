package com.Hospital.Controller;
import com.Hospital.Model.Employee;
import com.Hospital.Model.Doctor;
import com.Hospital.Model.Cashier;
import com.Hospital.Model.Receptionist;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReadEmployee {
	
	private ArrayList<Employee> employees ;
	
	private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
	private static ReadEmployee readEmployee = null;
	private ReadEmployee(){}
	public static ReadEmployee getInstance(){
		if(readEmployee == null) readEmployee = new ReadEmployee();
		return readEmployee;
	}	
	
	public ArrayList<Employee> getEmployees(){
		
		employees = new ArrayList<>();
		
		try{
			ResultSet rs = dbo.executeQuery(Queries.VIEW_EMPLOYEES.getQuery(),new Object[]{});
				while(rs.next()){
					Employee e = null;
					String specialist = "";
					String job = rs.getString(7);
					System.out.println(job);
					if(job.equals("DOCTOR")) specialist = rs.getString("specialist");
					
					switch(job){
						case "DOCTOR" : e = new Doctor(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"),specialist);
									break;
						case "CASHIER" : e = new Cashier(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"));
									break;
						case "RECEPTIONIST" : e = new Receptionist(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"));
									break;
						default:break;
								
					}
					employees.add(e);
				}
			
		}catch(SQLException e){
			System.out.println("READING EMPLOYEE FAILED"+e.getMessage());
		}

		return employees;
	}
	
	public Employee getEmployees(int id){
		
		Employee e = null;
		
		try{
			ResultSet rs = dbo.executeQuery(Queries.VIEW_EMPLOYEE.getQuery(),new Object[]{});
				if(rs.next()){
					String specialist = "";
					String job = rs.getString(7);
					System.out.println(job);
					if(job.equals("DOCTOR")) specialist = rs.getString("specialist");
					
					switch(job){
						case "DOCTOR" : e = new Doctor(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"),specialist);
									break;
						case "CASHIER" : e = new Cashier(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"));
									break;
						case "RECEPTIONIST" : e = new Receptionist(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"));
									break;
						default:break;
								
					}
				}
			
		}catch(SQLException er){
			System.out.println("READING EMPLOYEE FAILED"+er.getMessage());
		}

		return e;
	}
	
	
	
	
}
