package com.Hospital.Model;

public abstract class Employee extends User {

	public static int userId ;
	public static String userJob;
	private long salary;
	
	public Employee(){
		super();
	}
	
	public Employee(int id , String name ,String location ,String email , String mobileNo , String password , long salary){
		super(id,name,location,email,mobileNo,password);
		this.salary=salary;
	}
	
	public Employee(String name ,String location ,String email , String mobileNo , String password , long salary){
		super(name,location,email,mobileNo,password);
		this.salary=salary;
	}
	
	public long getSalary(){return salary;}
	
	public abstract int getJobId();
	public abstract String getJobName();

    public void setSalary(long salary) {
		this.salary=salary;
    }
}
