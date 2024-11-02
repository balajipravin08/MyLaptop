package com.Hospital.Model;

public class Receipt{
	private int id;
	private Cashier cashier;
	private Patient patient;
	private long amount;
	private int treatmentId;
	private String cashierName;
	private String patientName;
	
	public Receipt(){}

	public Receipt(int id , String cashierName , String patientName ,int treatmentId, long amount){
		this.id = id;
		this.cashierName=cashierName;
		this.patientName=patientName;
		this.treatmentId=treatmentId;
		this.amount = amount;
	}

	public Receipt(int id , Cashier cashier , Patient patient , long amount){
		this.id = id;
		this.cashier = cashier;
		this.patient = patient;
		this.amount = amount;
	}


	public int getId(){return id;}
	public Cashier getCashier(){return cashier;}
	public Patient getPatient(){return patient;}
	public long getAmount(){return amount;}
	public String getCashierName() {return cashierName;}
	public String getPatientName() {return patientName;}

	public void setTreatmentId(int treatmentId) {this.treatmentId = treatmentId;}

	public void setAmount(long amount) {this.amount = amount;}

	public int getTreatmentId() {return treatmentId;}

	public void setCashier(Cashier cashier) {this.cashier=cashier;}

	public void setPatient(Patient patient) {this.patient=patient;}
}
