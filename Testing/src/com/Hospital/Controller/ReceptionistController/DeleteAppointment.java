package com.Hospital.Controller.ReceptionistController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;

public class DeleteAppointment {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();

    public int deleteAppointment(int patientId){
        Object[] values = new Object[]{patientId};
        return dbo.executeUpdate(Queries.DELETE_APPOINTMENT.getQuery(),values);
    }
}
