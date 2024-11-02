package com.Hospital.Controller.DoctorController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Treatment;

public class CreateTreatment {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();

    public boolean addTreatment(Treatment treatment){
        Object[] values = new Object[]{treatment.getDoctor().getId(),treatment.getPatient().getId(),treatment.isPaid(),treatment.getDisease()};
        return dbo.executeUpdate(Queries.ADD_TREATMENT.getQuery(), values) !=0 ;
    }
}
