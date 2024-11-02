package com.Hospital.Controller.DoctorController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Report;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetPatientReports {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private ArrayList<Report> reports;

    public ArrayList<Report> getReports(int patientId) {
        reports = new ArrayList<>();
        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_PATIENT_REPORTS.getQuery(),new Object[]{patientId});
            if (rs!=null){
                while(rs.next()){
                    Report report = new Report(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getDate(4).toLocalDate(),rs.getString(5),rs.getString(6),rs.getBoolean(7));
                    reports.add(report);
                }
            }
        }catch(SQLException e){
            System.out.println("READING PATIENTS REPORTS FAILED "+e.getMessage());
        }
        return reports;
    }
}
