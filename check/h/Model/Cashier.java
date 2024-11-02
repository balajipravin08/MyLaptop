package com.Hospital.Model;

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
	
	public Cashier(String name ,String location ,String email , String mobileNo , String password , long salary){
		super(name,location,email,mobileNo,password,salary);
		assignInfo();
	}
	
	private void assignInfo(){
		/*this.info = new Info[] {
				new AddNewReceipt(),
				new ViewAllReceipts(),
				new ViewCashierReceipts(),
				new ViewPatientReceipts(),
				new ChangePassword()
		};	*/
	}
	
	
	public int getJobId(){return JOB_ID;}
	public String getJobName(){return JOB_NAME;}
}
