package com.Hospital.View;
import java.util.Scanner;
import com.Hospital.Controller.SignIn;

public class Login{
	
	private static final Scanner sc = MyScanner.getScannerInstance();
	private static final SignIn signIn = SignIn.getInstance();
	
	public void login(){
		System.out.println("Enter a Email : ");
		String email=sc.next();
		System.out.println("Enter a Password : ");
		String password=sc.next();
		
		if(signIn.employeelogin(email,password)){
			signIn.getUser().showList(sc);
		}else if(signIn.patientLogin(email,password)){
			signIn.getUser().showList(sc);
		}else{
			System.out.println("Wrong Email or Password");
		}
		
	}
}
