package com.Hospital.Model;
import com.Hospital.View.CashierView.*;
import com.Hospital.View.LogOut;

import java.util.Arrays;

public class Cashier extends Employee{

	private static final int JOB_ID = 1;
	private static final String JOB_NAME = "CASHIER";
	
	public Cashier(){
		super();
		assignInfo();
	}
	
	public Cashier(int id , String name ,String location ,String email , String mobileNo , String password , long salary){
		super(id,name,location,email,mobileNo,password,salary);
		assignInfo();
	}

	public Cashier(int id , String name , String location ,String email , String mobileNo , String password){
		super(id,name,location,email,mobileNo,password);
		assignInfo();
	}
	
	public Cashier(String name ,String location ,String email , String mobileNo , String password , long salary){
		super(name,location,email,mobileNo,password,salary);
		assignInfo();
	}
	
	private void assignInfo(){
		this.operations = Arrays.asList(new AddReceipt(),new ViewReceipts(),new ViewCashierReceipts(),new ViewPatientReceipts(),new EditCashier(),new LogOut());
	}
	
	
	public int getJobId(){return JOB_ID;}
	public String getJobName(){return JOB_NAME;}
}
