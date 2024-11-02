package com.Hospital.Controller.AdminController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;

public class DeleteEmployee {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();

    public int deleteEmployee(int employeeId){
        Object[] values = new Object[]{employeeId};
        return dbo.executeUpdate(Queries.DELETE_EMPLOYEE.getQuery(),values);
    }
}
