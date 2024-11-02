package com.Hospital.Controller;

import com.Hospital.Model.Patient;

public class UpdatePatient {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private UpdatePatient(){}
    private static UpdatePatient u = null;
    public static UpdatePatient getInstance(){
        if (u==null) u=new UpdatePatient();
        return u;
    }

    public int updateEmployee(Patient patient){
        Object[] values = {patient.getName(),patient.getEmail(),patient.getMobileNo(),patient.getBloodGroup(),patient.getId()};
        return dbo.executeUpdate(Queries.UPDATE_PATIENT.getQuery(),values);

    }
}
