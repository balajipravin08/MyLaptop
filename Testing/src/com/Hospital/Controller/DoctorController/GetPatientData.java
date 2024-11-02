package com.Hospital.Controller.DoctorController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Patient;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetPatientData {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();

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
