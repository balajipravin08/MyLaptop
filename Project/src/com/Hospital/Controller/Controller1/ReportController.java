package com.Hospital.Controller.Controller1;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Report;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReportController {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private ArrayList<Report> reports;

    public boolean addReport(Report report) {
        Object[] values = new Object[]{report.getDoctor().getId(),report.getPatient().getId(),report.getDisease(),report.getTreatment(),report.isPaid()};
        return dbo.executeUpdate(Queries.ADD_REPORT.getQuery(),values) !=0;
    }

    public ArrayList<Report> getReports(int patientId , int doctorId) {
        reports = new ArrayList<>();
        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_DOCTOR_REPORTS.getQuery(),new Object[]{patientId,doctorId});
            if(rs!=null){
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
