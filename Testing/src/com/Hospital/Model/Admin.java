package com.Hospital.Model;
import com.Hospital.View.LogOut;
import com.Hospital.View.PatientView.EditPatient;
import com.Hospital.View.AdminView.*;

import java.util.Arrays;

public class Admin extends Employee{

	private static final int JOB_ID = 2;
	private static final String JOB_NAME = "ADMIN";
	
	public Admin(){
		super();
		assignInfo();
	}
	
	public Admin(int id , String name , String location , String email , String mobileNo , String password , long salary){
		super(id,name,location,email,mobileNo,password,salary);
		assignInfo();
	}

	public Admin(int id , String name , String location , String email , String mobileNo , String password){
		super(id,name,location,email,mobileNo,password);
		assignInfo();
	}
	
	public Admin(String name , String location , String email , String mobileNo , String password , long salary){
		super(name,location,email,mobileNo,password,salary);
		assignInfo();
	}
	
	private void assignInfo(){
		this.operations = Arrays.asList(new AddEmployee(),new AddPatient(),new ViewEmployees(),new ViewPatients(),new EditEmployee(),new EditPatient(),new FireEmployee(),new RemovePatient(),new LogOut());
	}
	
	
	public int getJobId(){return JOB_ID;}
	public String getJobName(){return JOB_NAME;}
}
