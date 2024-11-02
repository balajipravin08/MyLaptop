package com.Hospital.Controller.CashierController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Employee;

public class UpdateCashier {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();

    public int updateCashier(Employee employee){
        String specialist ="";
        Object[] values = {employee.getName(),employee.getEmail(),employee.getMobileNo(),employee.getSalary(),specialist, employee.getId()};
        return dbo.executeUpdate(Queries.UPDATE_EMPLOYEE.getQuery(),values);
    }
}
