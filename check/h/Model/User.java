package com.Hospital.Model;
import java.util.List;
import java.util.Scanner;

public class User{

	public static int userId;
	private int id;
	private String name;
	private String location;
	private String email;
	private String mobileNo;
	private String password;
	protected List<Operations> operations;


	public User(){}
	
	public User(int id , String name , String location , String email , String mobileNo , String password ){
		this.id=id;
		this.name=name;
		this.location=location;
		this.email=email;
		this.mobileNo=mobileNo;
		this.password=password;
	}
	
	public User(String name , String location , String email , String mobileNo , String password ){
		this.name=name;
		this.location=location;
		this.email=email;
		this.mobileNo=mobileNo;
		this.password=password;
	}
	
	public void showList(Scanner sc) {
		for (int i = 1; i<= operations.size(); i++) {
			System.out.println(i+". "+ operations.get(i - 1).getName());
		}
		int selected = sc.nextInt();
		operations.get(selected - 1).Operation(this);
		showList(sc);
	}
	
	public int getId(){return id;}
	public String getName(){return name;}
	public String getLocation(){return location;}
	public String getEmail(){return email;}
	public String getMobileNo(){return mobileNo;}
	public String getPassword(){return password;}

	public void setName(String name) {
		this.name=name;
	}

	public void setEmail(String email) {
		this.email=email;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo=mobileNo;
	}
}
