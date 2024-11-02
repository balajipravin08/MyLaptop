package com.Hospital.Controller;
import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SignIn {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private static SignIn signIn = null;
    private SignIn (){}
    public static SignIn getInstance(){
        if(signIn == null) signIn = new SignIn();
        return signIn;
    }
    private User user;

    public boolean employeelogin(String email,String password){
        Object[] values = new Object[]{email,password};
        try{
            ResultSet rs = dbo.executeQuery(Queries.EMPLOYEE_LOGIN.getQuery(), values);
            if(rs.next()){
                int job = rs.getInt("job");
                switch (job) {//id,name,location,email,mobileNo,password,salary
                    case 0:
                        user = new Doctor(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"));
                        ((Doctor) user).setSpecialist(rs.getString("specialist"));
                        break;
                    case 1:
                        user = new Cashier(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"));
                        break;
                    case 2:
                        user = new Admin(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"));
                        break;
                    case 3:
                        user = new Receptionist(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"));
                        break;
                    default:
                        break;
                }
                return true;
            }

        }
        catch(SQLException e){
            System.out.println("Login Error "+e.getMessage());
        }

        return false;
    }

    public boolean patientLogin(String email,String password){
        Object[] values = new Object[]{email,password};
        try{

            ResultSet rs = dbo.executeQuery(Queries.PATIENT_LOGIN.getQuery() , values);
            if(rs.next()){
                user = new Patient(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"));
                return true;
            }
        }catch(SQLException e){
            System.out.println("Login Error "+e.getMessage());
        }

        return false;
    }

    public User getUser(){return user;}
}
