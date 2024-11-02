package com.Hospital.Controller.AdminController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;

public class DeletePatient {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();

    public int deletePatient(int patientId) {
        Object[] values = new Object[]{patientId};
        return dbo.executeUpdate(Queries.DELETE_PATIENT.getQuery(), values);
    }
}
