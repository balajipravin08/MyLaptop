package com.Hospital.Model;
import java.util.Arrays;

import com.Hospital.View.DoctorView.*;
import com.Hospital.View.LogOut;
import com.Hospital.View.PatientView.ViewPatientData;
import com.Hospital.View.PatientView.ViewPatientReports;
import com.Hospital.View.PatientView.ViewPatientTreatment;

public class Doctor extends Employee{
	
	private static final int JOB_ID = 0;
	private static final String JOB_NAME = "DOCTOR";
	private String specialist ;
	
	public Doctor() {
		super();
		assignInfo();
	}
	
	public Doctor(int id , String name , String location ,String email , String mobileNo , String password , long salary , String specialist){
		super(id,name,location,email,mobileNo,password,salary);
		this.specialist=specialist;

	}

	public Doctor(int id , String name , String location ,String email , String mobileNo , String password){
		super(id,name,location,email,mobileNo,password);

	}
	
	public Doctor(String name , String location ,String email , String mobileNo , String password , long salary , String specialist){
		super(name,location,email,mobileNo,password,salary);
		this.specialist=specialist;
	}
	
	private void assignInfo(){
		this.operations = Arrays.asList(new AddTreatment(),new AddReport(),new ViewPatientData(),new ViewPatientTreatment()
		,new ViewPatientReports(),new ViewDoctorTreatment(),new ViewDoctorReports(),new EditDoctor(),new LogOut());
	}
	
	public String getSpecialist(){return specialist;}
	public int getJobId(){return JOB_ID ;}
	public String getJobName(){return JOB_NAME ;}

    public void setSpecialist(String specialist) {
		this.specialist=specialist;
    }
}
