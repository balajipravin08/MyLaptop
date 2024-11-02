package com.Hospital.Controller.AdminController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Patient;

public class CreatePatient {

    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();

    public boolean addPatient(Patient patient) {
        Object[] values = new Object[]{patient.getName(),patient.getMobileNo(),patient.getLocation(),patient.getEmail(),patient.getPassword(),patient.getBloodGroup()};
        return dbo.executeUpdate(Queries.ADD_PATIENT.getQuery(),values) !=0 ;
    }
}
