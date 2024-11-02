package com.Hospital.Controller;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;

public class CreateTables {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    public static void createDatabaseTables(){
        dbo.executeUpdate(Queries.CREATE_EMPLOYEE.getQuery());
        dbo.executeUpdate(Queries.ADD_SUPER_ADMIN.getQuery());
        dbo.executeUpdate(Queries.CREATE_PATIENT.getQuery());
        dbo.executeUpdate(Queries.CREATE_APPOINTMENT.getQuery());
        dbo.executeUpdate(Queries.CREATE_TREATMENT.getQuery());
        dbo.executeUpdate(Queries.CREATE_RECEIPT.getQuery());
        dbo.executeUpdate(Queries.CREATE_REPORT.getQuery());

    }
}
