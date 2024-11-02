package com.Hospital.Controller.AdminController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Doctor;
import com.Hospital.Model.Employee;

public class UpdateEmployee {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();

    public int updateEmployee(Employee employee){
        String specialist ="";
        if (employee.getJobId()==0){specialist = ((Doctor)employee).getSpecialist();}
        Object[] values = {employee.getName(),employee.getEmail(),employee.getMobileNo(),employee.getSalary(),specialist, employee.getId()};
        return dbo.executeUpdate(Queries.UPDATE_EMPLOYEE.getQuery(),values);
    }
}
