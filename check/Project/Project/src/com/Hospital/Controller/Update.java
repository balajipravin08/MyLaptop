package com.Hospital.Controller;
import com.Hospital.Model.Doctor;
import com.Hospital.Model.Employee;
import com.Hospital.Model.Patient;

public class Update {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private static Update update = null;
    private Update(){}
    public static Update getInstance(){
        if(update == null) update = new Update();
        return update;
    }

    public int updateEmployee(Employee employee){
        String specialist ="";
        if (employee.getJobId()==0){specialist = ((Doctor)employee).getSpecialist();}
        Object[] values = {employee.getName(),employee.getEmail(),employee.getMobileNo(),employee.getSalary(),specialist, employee.getId()};
        return dbo.executeUpdate(Queries.UPDATE_EMPLOYEE.getQuery(),values);
    }

    public int updateEmployee(Patient patient){
        Object[] values = {patient.getName(),patient.getEmail(),patient.getMobileNo(),patient.getBloodGroup(),patient.getId()};
        return dbo.executeUpdate(Queries.UPDATE_PATIENT.getQuery(),values);
    }
}
