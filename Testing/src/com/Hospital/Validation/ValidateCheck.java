package com.Hospital.Validation;

import com.Hospital.View.MyScanner;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class ValidateCheck implements Validate{
   private static final Scanner sc = MyScanner.getScannerInstance();
  public  boolean validatePassword(String password) {
        String regex = "^[A-Za-z][A-Za-z0-9!@#$%^&*]{9,10}$";
        Pattern pattern = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
  }
    
   public  boolean validateNumber(String number) {
        String regex = "^[6-9]\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
       if (number == null) {
           return false;
       }
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
  }

    public boolean validateEmail(String email) {
        String regex ="^[a-z0-9.]+@[a-z.]+\\.[a-zA-Z]{3}$";
        Pattern pattern = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    public String getValidatedPassword(String prompt){
      		System.out.println(prompt);
      		String password = sc.next();
      			while(!validatePassword(password)){
          			System.out.println("Invalid Syntax for password......." + prompt);
          			password = sc.next();
     			}
     		return password;
   }         
  public String getValidatedMobileNumber(String prompt){
     		System.out.println(prompt);
       		String mobileNumber = sc.next();
    			while(!validateNumber(mobileNumber)){
         				System.out.println("Invalid syntax for mobile number......." + prompt);
         				mobileNumber=sc.next();
       			}
       		return mobileNumber;
  }
    public String getValidatedEmail(String prompt){
        System.out.println(prompt);
        String email = sc.next();
        while(!validateEmail(email)){
            System.out.println("Invalid syntax for Email......." + prompt);
            email=sc.next();
        }
        return email;
    }
}
