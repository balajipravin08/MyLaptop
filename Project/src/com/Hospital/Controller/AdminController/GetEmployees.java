package com.Hospital.Controller.AdminController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetEmployees {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private ArrayList<Employee> employees ;

    public ArrayList<Employee> getEmployees(){
        employees = new ArrayList<>();
        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_EMPLOYEES.getQuery(),new Object[]{});
            while(rs.next()){
                Employee e = null;
                String specialist = "";
                int job = rs.getInt(7);
                if(job==0) specialist = rs.getString("specialist");
                switch(job){
                    case 0 : e = new Doctor(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"),specialist);
                        break;
                    case 1 : e = new Cashier(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"));
                        break;
                    case 2 : e = new Admin(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"));
                        break;
                    case 3 : e = new Receptionist(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"));
                        break;
                    default:break;

                }
                employees.add(e);
            }
        }catch(SQLException e){
            System.out.println("READING EMPLOYEE FAILED"+e.getMessage());
        }   return employees;
    }


    public Employee getEmployees(int employeeId){

        Employee employee = null;
        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_EMPLOYEE.getQuery(),new Object[]{employeeId});
            if(rs.next()){
                String specialist = "";
                int job = rs.getInt(7);
                if(job==0) specialist = rs.getString("specialist");

                switch(job){
                    case 0 : employee = new Doctor(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"),specialist);
                        break;
                    case 1 : employee = new Cashier(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"));
                        break;
                    case 2 : employee = new Admin(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"));
                        break;
                    case 3 : employee = new Receptionist(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"));
                        break;
                    default:break;

                }
            }

        }catch(SQLException er){
            System.out.println("READING EMPLOYEE FAILED"+er.getMessage());
        }

        return employee;
    }
}
