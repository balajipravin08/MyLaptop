package com.Hospital.Model;

import java.util.Arrays;

//import View.*;
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
	
	public Patient(String name ,String location ,String email , String mobileNo , String password , String bloodGroup){
		super(name,location,email,mobileNo,password);
		this.bloodGroup=bloodGroup;
		assignInfo();
	}
	
	private void assignInfo(){
		this.operations = Arrays.asList();
	}
	
	public String getBloodGroup(){return bloodGroup;}

    public void setBloodGroup(String bloodGroup) {
		this.bloodGroup=bloodGroup;
    }
}
/*this.info = new Info[] {
				new ViewPatientUserData(),
				new ViewPatientUserOperations(),
				new ViewPatientUserReports(),
				new ViewPatientUnpaidOperations(),
				new ViewPatientUnpaidReports(),
				new ViewPatientPaidOperations(),
				new ViewPatientPaidReports(),
				new ViewUserReceipts(),
				new ChangePatientPassword()
		};*/
