package com.Hospital.Controller.DoctorController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Treatment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetDoctorTreatment {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private ArrayList<Treatment> treatments;

    public ArrayList<Treatment> getTreatments(int patientId , int doctorId){
        treatments = new ArrayList<>();
        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_DOCTOR_TREATMENTS.getQuery(),new Object[]{patientId,doctorId});
            while(rs.next()){
                Treatment treatment = new Treatment(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getDate(4).toLocalDate(),rs.getString(5),rs.getBoolean(6));
                treatments.add(treatment);
            }
        }catch(SQLException e){
            System.out.println("READING DOCTOR TREATMENTS FAILED "+e.getMessage());
        }
        return treatments;
    }
}
