package com.Hospital.Controller;

import com.Hospital.Model.Doctor;
import com.Hospital.Model.Employee;


public class UpdateEmployee {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private UpdateEmployee(){}
    private static UpdateEmployee u = null;
    public static UpdateEmployee getInstance(){
        if (u==null) u=new UpdateEmployee();
        return u;
    }

    public int updateEmployee(Employee employee){
        String specialist ="";
        if (employee.getJobId()==0){specialist = ((Doctor)employee).getSpecialist();}
        Object[] values = {employee.getName(),employee.getEmail(),employee.getMobileNo(),employee.getSalary(),specialist, employee.getId()};
        return dbo.executeUpdate(Queries.UPDATE_EMPLOYEE.getQuery(),values);

    }
}
//e.getName(),e.getLocation(),e.getEmail(),e.getMobileNo(),e.getPassword(),e.getSalary(),specialist);
