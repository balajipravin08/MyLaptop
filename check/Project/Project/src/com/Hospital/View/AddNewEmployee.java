package com.Hospital.View;
import java.util.Scanner;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Doctor;
import com.Hospital.Model.Cashier;
import com.Hospital.Model.Receptionist;
import com.Hospital.Model.Employee;
import com.Hospital.Model.User;
import com.Hospital.Controller.Create;

public class AddNewEmployee implements Operations {
	
	private static final Scanner sc = MyScanner.getScannerInstance();
	public Employee employee ;
	
	public void operation(User u){
		System.out.println("Enter a name : ");
		String name = sc.next();
		System.out.println("Enter a Email : ");
		String email = sc.next();
		System.out.println("Enter a Mobile Number : ");
		String mobileNo = sc.next();
		System.out.println("Enter a Location : ");
		String location = sc.next();
		System.out.println("Enter a Password : ");
		String password = sc.next();
		String cPassword ;
		do{
			System.out.println("Confirm Password");
			cPassword = sc.next();
		}while(!password.equals(cPassword));
		
		System.out.println("Enter a Salary : ");
		long salary = sc.nextLong();
		int job;
		do{
			System.out.println("Enter job title:\n0. Doctor\n1. Cashier\n2. Receptionist");
			job = sc.nextInt();
		}while(job<0 || job>2);
		
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
				employee = new Receptionist(name,location,email,mobileNo,password,salary);
				break;
			default:break;
		}
		
		if(Create.getInstance().addEmployee(employee)) {
			System.out.println("Employee Added Sucessfully");
		}
		else {
			System.out.println("Employee Already Exist");
		}
		
	}
	
	public String getName(){
		return "Add New Employee";
	}
}
