package com.Hospital.Controller.AdminController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Patient;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetPatients {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private ArrayList<Patient> patients ;

    public ArrayList<Patient> getPatients(){

        patients = new ArrayList<>();

        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_PATIENTS.getQuery(),new Object[]{});
            while(rs.next()){
                Patient patient = new Patient(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getString("bloodgroup"));
                patients.add(patient);
            }
        }catch(SQLException e){
            System.out.println("READING PATIENTS FAILED"+e.getMessage());
        }

        return patients;
    }
    public Patient getPatients(int patientId){
        Patient patient = null;
        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_PATIENT.getQuery(),new Object[]{patientId});
            if(rs.next()){
                patient = new Patient(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getString("bloodgroup"));
            }
        }catch(SQLException e){
            System.out.println("READING PATIENTS FAILED"+e.getMessage());
        }
        return patient;
    }
}
