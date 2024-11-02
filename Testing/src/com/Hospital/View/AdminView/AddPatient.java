package com.Hospital.View.AdminView;
import com.Hospital.Controller.AdminController.CreatePatient;
import com.Hospital.Model.Operations;
import com.Hospital.Model.User;
import com.Hospital.Model.Patient;
import com.Hospital.Validation.ValidateCheck;
import com.Hospital.View.MyScanner;

import java.util.Scanner;

public class AddPatient extends ValidateCheck implements Operations {
	private static final Scanner sc = MyScanner.getScannerInstance();

	
	public void operation(User user){
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

		System.out.println("Enter a Blood Group : ");
		String bloodGroup = sc.next();
		Patient patient = new Patient(name,location,email,mobileNo,password,bloodGroup);
		
		if(new CreatePatient().addPatient(patient)){
			System.out.println("Patient added Sucessfully");
		}else{
			System.out.println("Patient already exist");
		}

	}
	
	public String getName(){
		return "Add New Patient";
	}
}
