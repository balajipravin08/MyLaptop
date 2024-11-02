package com.Hospital.View.AdminView;
import java.util.Scanner;

import com.Hospital.Controller.AdminController.CreateEmployee;
import com.Hospital.Model.*;
import com.Hospital.Validation.ValidateCheck;
import com.Hospital.View.MyScanner;

public class AddEmployee extends ValidateCheck implements Operations  {
	
	private static final Scanner sc = MyScanner.getScannerInstance();
	public Employee employee ;
	
	public void operation(User u){
		System.out.println("Enter a name : ");
		String name = sc.next();
		String email = getValidatedEmail("Enter a Email : ");
		String mobileNo = getValidatedMobileNumber("Enter a Mobile Number : ");
		System.out.println("Enter a Location : ");
		String location = sc.next();
		String password = getValidatedPassword("Enter a Password : ");
		String cPassword ;
		do{
			cPassword = getValidatedPassword("Confirm Password");
		}while(!password.equals(cPassword));
		
		System.out.println("Enter a Salary : ");
		long salary = sc.nextLong();
		int job;
		do{
			System.out.println("Enter job title:\n0. Doctor\n1. Cashier\n2. Admin\n3.Receptionist");
			job = sc.nextInt();
		}while(job<0 || job>3);
		
		String specialist = "";
		if(job==0){
			System.out.println("Enter a Specialization : ");
			specialist = sc.next();
		}
		
		switch(job){
			case 0 : 
				employee = new Doctor(name,location,email,mobileNo,password,salary,specialist);
				break;
			case 1 :
				employee = new Cashier(name,location,email,mobileNo,password,salary);
				break;
			case 2 : 
				employee = new Admin(name,location,email,mobileNo,password,salary);
				break;
			case 3 :
				employee = new Receptionist(name,location,email,mobileNo,password,salary);
				break;
			default:break;
		}
		
		if(new CreateEmployee().addEmployee(employee)) {
			System.out.println("Employee Added Successfully");
		}
		else {
			System.out.println("Employee Already Exist");
		}
		
	}
	
	public String getName(){
		return "Add New Employee";
	}
}
