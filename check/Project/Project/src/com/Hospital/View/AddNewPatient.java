package com.Hospital.View;
import com.Hospital.Controller.Create;
import com.Hospital.Model.Operations;
import com.Hospital.Model.User;
import com.Hospital.Model.Patient;
import java.util.Scanner;

public class AddNewPatient implements Operations {
	private static final Scanner sc = MyScanner.getScannerInstance();

	private static Create create = Create.getInstance();
	
	public void operation(User user){
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
		String cPassword;
		do{
			System.out.println("Confirm Password");
			cPassword = sc.next();
		}while(!password.equals(cPassword));
		System.out.println("Enter a Blood Group : ");
		String bloodGroup = sc.next();
		Patient patient = new Patient(name,location,email,mobileNo,password,bloodGroup);
		
		if(create.addPatient(patient)){
			System.out.println("Patient added Sucessfully");
		}else{
			System.out.println("Patient already exist");
		}

	}
	
	public String getName(){
		return "Add New Patient";
	}
}
