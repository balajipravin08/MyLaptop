package com.Hospital.Controller;
import com.Hospital.Model.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeLogin{
	private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
	private static EmployeeLogin login = null;
	private EmployeeLogin (){}
	public static EmployeeLogin getInstance(){
		if(login == null) login = new EmployeeLogin();
		return login;
	}
	
	public boolean login(String email,String password){
		Object[] values = new Object[]{email,password};
		try{

			ResultSet rs = dbo.executeQuery(Queries.EMPLOYEE_LOGIN.getQuery(), values);
			if(rs.next()){
				Employee.userId = rs.getInt(1);
				Employee.userJob = rs.getString(2);
				return true;
			}
		}catch(SQLException e){
			System.out.println("Login Error "+e.getMessage());
		}
		
		return false;
	}
	
}
