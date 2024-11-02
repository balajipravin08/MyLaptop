package com.Hospital.View;
import java.util.Scanner;

import com.Hospital.Model.*;
import com.Hospital.Controller.EmployeeLogin;
import com.Hospital.Controller.PatientLogin;
public class Login{
	
	private static final Scanner sc = MyScanner.getScannerInstance();
	private static final EmployeeLogin eLogin = EmployeeLogin.getInstance();
	private static final PatientLogin pLogin = PatientLogin.getInstance();
	//private Employee employee ;
	
	public void login(){
		System.out.println("Enter a Email : ");
		String email=sc.next();
		System.out.println("Enter a Password : ");
		String password=sc.next();
		
		if(eLogin.login(email,password)){
			String job = Employee.userJob;
			System.out.println(job);
			switch(job){
				case "DOCTOR" :
					new Doctor().showList(sc);
					break;
				case "CASHIER" : new Cashier().showList(sc);
					break;
				case "RECEPTIONIST" : new Receptionist().showList(sc);
					break;
				default: break;
			}
		}else if(pLogin.login(email,password)){
			new Patient().showList(sc);
		}else{
			System.out.println("Wrong Email or Password");
		}
		
	}
}
