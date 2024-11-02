package com.Hospital.Controller.PatientController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Patient;

public class UpdatePatient {

    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();

    public int updatePatient(Patient patient){
        Object[] values = {patient.getName(),patient.getEmail(),patient.getMobileNo(),patient.getBloodGroup(),patient.getId()};
        return dbo.executeUpdate(Queries.UPDATE_PATIENT.getQuery(),values);
    }
}
