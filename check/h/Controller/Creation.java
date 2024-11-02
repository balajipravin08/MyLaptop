package com.Hospital.Controller;
import com.Hospital.Model.Employee;
import com.Hospital.Model.Doctor;
import com.Hospital.Model.Patient;


public class Creation {

	private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
	private static Creation creation = null;
	private Creation (){}
	public static Creation getInstance(){
		if(creation == null) creation = new Creation();
		return creation;
	}
	
	
	public boolean addEmployee(Employee emp){
		String specialist = "" ;
		if(emp.getJobId()==0) specialist = ((Doctor)emp).getSpecialist();
		Object[] values = new Object[]{emp.getName(),emp.getMobileNo(),emp.getLocation(),emp.getEmail(),emp.getPassword(),emp.getJobName(),emp.getSalary(),specialist};
		return dbo.executeUpdate(Queries.ADD_EMPLOYEE.getQuery(), values) != 0 ;
		
	}

    public boolean addPatient(Patient patient) {

		Object[] values = new Object[]{patient.getName(),patient.getMobileNo(),patient.getLocation(),patient.getEmail(),patient.getPassword(),patient.getBloodGroup()};
		return dbo.executeUpdate(Queries.ADD_PATIENT.getQuery(),values) !=0 ;
    }
}
