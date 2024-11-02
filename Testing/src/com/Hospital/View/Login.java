package com.Hospital.View;

import java.util.Scanner;
import com.Hospital.Controller.SignIn;
import com.Hospital.Validation.ValidateCheck;

public class Login extends ValidateCheck {
	
	private static final Scanner sc = MyScanner.getScannerInstance();
	private static final SignIn signIn = SignIn.getInstance();
	private int attempt ;
	
	public void login(){

		System.out.println("-------------------------");
		System.out.println("     Welcome Hospital    ");
		System.out.println("-------------------------");

		String email=getValidatedEmail("Enter a Email : ");
		String password=getValidatedPassword("Enter a Password : ");
		
		if(signIn.employeelogin(email,password)){
			attempt=0;
			signIn.getUser().showList(sc);
		}else if(signIn.patientLogin(email,password)){
			attempt=0;
			signIn.getUser().showList(sc);
		}else{
			attempt++;
			System.out.println("Wrong Email or Password "+ (3-attempt) + " remaining attempts");
			if(attempt==3){
				new LogOut();
			}
			login();
		}
	}
}
