package com.Hospital.Controller.DoctorController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Report;

public class CreateReport {

    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();

    public boolean addReport(Report report) {
        Object[] values = new Object[]{report.getDoctor().getId(),report.getPatient().getId(),report.getDisease(),report.getTreatment(),report.isPaid()};
        return dbo.executeUpdate(Queries.ADD_REPORT.getQuery(),values) !=0;
    }
}
