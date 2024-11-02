package com.Hospital.Controller.AdminController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Doctor;
import com.Hospital.Model.Employee;

public class CreateEmployee {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();

    public boolean addEmployee(Employee emp){
        String specialist = "" ;
        if(emp.getJobId()==0) specialist = ((Doctor)emp).getSpecialist();
        Object[] values = new Object[]{emp.getName(),emp.getMobileNo(),emp.getLocation(),emp.getEmail(),emp.getPassword(),emp.getJobId(),emp.getSalary(),specialist};
        return dbo.executeUpdate(Queries.ADD_EMPLOYEE.getQuery(), values) != 0 ;

    }
}
