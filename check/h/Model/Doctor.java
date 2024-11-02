package com.Hospital.Model;
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
		assignInfo();
	}
	
	public Doctor(String name , String location ,String email , String mobileNo , String password , long salary , String specialist){
		super(name,location,email,mobileNo,password,salary);
		this.specialist=specialist;
		assignInfo();
	}
	
	
	private void assignInfo(){
		/*this.info = new Info[]{
				new AddNewOperation(),
				new AddNewReport(),
				new ViewPatientData(),
				new ViewPatientOperations(),
				new ViewPatientReports(),
				new ViewDoctorOperations(),
				new ViewDoctorReports(),
				new ChangePassword()
		};*/
	}
	
	public String getSpecialist(){return specialist;}
	public int getJobId(){return JOB_ID ;}
	public String getJobName(){return JOB_NAME ;}

    public void setSpecialist(String specialist) {
		this.specialist=specialist;
    }
}
