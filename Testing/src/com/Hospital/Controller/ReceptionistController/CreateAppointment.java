package com.Hospital.Controller.ReceptionistController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Appointment;

public class CreateAppointment {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();

    public boolean addAppointment(Appointment appointment){
        Object[] values = new Object[]{appointment.getDoctorId(),appointment.getPatientId()};
        return dbo.executeUpdate(Queries.ADD_APPOINTMENT.getQuery(),values) !=0 ;
    }
}
