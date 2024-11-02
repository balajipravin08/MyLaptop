package com.Hospital.Controller.ReceptionistController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Doctor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetAvailableDoctors {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private ArrayList<Doctor> doctors ;

    public ArrayList<Doctor> getAvailableDoctors(){
        doctors = new ArrayList<>();
        try {
            ResultSet rs = dbo.executeQuery(Queries.VIEW_DOCTORS.getQuery(),new Object[]{});
            if(rs!=null){
                while(rs.next()){
                    Doctor doctor = new Doctor(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getLong("salary"),rs.getString("specialist"));
                    doctors.add(doctor);
                }
            }
        } catch (SQLException e) {
            System.out.println("Reading Doctors Failed"+e.getMessage());
        }
        return doctors;
    }
}
