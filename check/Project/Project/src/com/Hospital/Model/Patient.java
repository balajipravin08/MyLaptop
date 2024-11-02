package com.Hospital.Model;
import com.Hospital.View.EditPatient;
import com.Hospital.View.ViewPatientData;
import com.Hospital.View.ViewPatientReports;
import com.Hospital.View.ViewPatientTreatment;

import java.util.Arrays;

public class Patient extends User{
	private String bloodGroup;
	
	public Patient(){
		super();
		assignInfo();
	} 
	
	public Patient(int id , String name ,String location ,String email , String mobileNo , String password , String bloodGroup){
		super(id,name,location,email,mobileNo,password);
		this.bloodGroup=bloodGroup;
		assignInfo();
	}

	public Patient(int id , String name , String location ,String email , String mobileNo , String password){
		super(id,name,location,email,mobileNo,password);
	}

	public Patient(String name ,String location ,String email , String mobileNo , String password , String bloodGroup){
		super(name,location,email,mobileNo,password);
		this.bloodGroup=bloodGroup;
		assignInfo();
	}
	
	private void assignInfo(){
		this.operations = Arrays.asList(new ViewPatientData(),new ViewPatientTreatment(),new ViewPatientReports(),new EditPatient());
	}
	
	public String getBloodGroup(){return bloodGroup;}

    public void setBloodGroup(String bloodGroup) {
		this.bloodGroup=bloodGroup;
    }
}

