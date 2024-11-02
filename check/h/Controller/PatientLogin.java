package com.Hospital.Controller;

import com.Hospital.Model.Employee;
import com.Hospital.Model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientLogin {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private static PatientLogin login = null;
    private PatientLogin (){}
    public static PatientLogin getInstance(){
        if(login == null) login = new PatientLogin();
        return login;
    }

    public boolean login(String email,String password){
        Object[] values = new Object[]{email,password};
        try{

            ResultSet rs = dbo.executeQuery(Queries.PATIENT_LOGIN.getQuery() , values);
            if(rs.next()){
                User.userId = rs.getInt(1);
                return true;
            }
        }catch(SQLException e){
            System.out.println("Login Error "+e.getMessage());
        }

        return false;
    }
}
