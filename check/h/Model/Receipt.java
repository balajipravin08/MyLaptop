package com.Hospital.Model;

public class Receipt{
	private int id;
	private Cashier cashier;
	private Patient patient;
	private double amount;
	private int type;
	// 0 ==> Opration
	// 1 ==> Report
	private int itemId;
	
	public Receipt(){}
	
	public Receipt(int id , Cashier cashier , Patient patient , double amount , int type , int itemId){
		this.id = id;
		this.cashier = cashier;
		this.patient = patient;
		this.amount = amount;
		this.type = type;
		this.itemId = itemId;
	}
	
	public int getId(){return id;}
	public Cashier getCashier(){return cashier;}
	public Patient getPatient(){return patient;}
	public double getAmount(){return amount;}
	public int getType(){return type;}
	public int getItemId(){return itemId;}
	public String getTypeName(){
		if(type ==0) return "Operation" ;
		else if(type==1) return "Report";
		else return null;
	}
	
}
