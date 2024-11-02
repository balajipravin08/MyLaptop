package com.Hospital.Controller;
import com.Hospital.Model.*;

public class Create {

	private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
	private static Create create = null;
	private Create(){}
	public static Create getInstance(){
		if(create == null) create = new Create();
		return create;
	}
	
	
	public boolean addEmployee(Employee emp){
		String specialist = "" ;
		if(emp.getJobId()==0) specialist = ((Doctor)emp).getSpecialist();
		Object[] values = new Object[]{emp.getName(),emp.getMobileNo(),emp.getLocation(),emp.getEmail(),emp.getPassword(),emp.getJobId(),emp.getSalary(),specialist};
		return dbo.executeUpdate(Queries.ADD_EMPLOYEE.getQuery(), values) != 0 ;
		
	}

    public boolean addPatient(Patient patient) {

		Object[] values = new Object[]{patient.getName(),patient.getMobileNo(),patient.getLocation(),patient.getEmail(),patient.getPassword(),patient.getBloodGroup()};
		return dbo.executeUpdate(Queries.ADD_PATIENT.getQuery(),values) !=0 ;
    }

	public boolean addTreatment(Treatment treatment){
		Object[] values = new Object[]{treatment.getDoctor().getId(),treatment.getPatient().getId(),treatment.isPaid(),treatment.getDisease()};
		return dbo.executeUpdate(Queries.ADD_TREATMENT.getQuery(), values) !=0 ;
	}

	public boolean addReport(Report report) {
		Object[] values = new Object[]{report.getDoctor().getId(),report.getPatient().getId(),report.getDisease(),report.getTreatment(),report.isPaid()};
		return dbo.executeUpdate(Queries.ADD_REPORT.getQuery(),values) !=0;
	}

	public boolean addReceipt(Receipt receipt){
		Object[] values = new Object[]{receipt.getCashier().getId(),receipt.getPatient().getId(),receipt.getTreatmentId(),receipt.getAmount()};
		return dbo.executeUpdate(Queries.ADD_RECEIPT.getQuery(),values) !=0;
	}
}
