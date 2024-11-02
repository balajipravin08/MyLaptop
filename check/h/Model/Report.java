package com.Hospital.Model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Report{
	
	private int id ;
	private Doctor doctor;
	private Patient patient;
	private LocalDateTime dateTime;
	private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy-HH:mm:ss");
	private String disease;
	private String treatement;
	private boolean paid;
	
	
	public Report(){}
	public Report(int id , Doctor doctor , Patient patient , LocalDateTime dateTime , String disease ,String treatement, boolean paid){
		this.id = id;
		this.doctor = doctor;
		this.patient = patient;
		this.dateTime = dateTime;
		this.disease = disease;
		this.treatement= treatement;
		this.paid=paid;
	}
	
	public Report(Doctor doctor , Patient patient , LocalDateTime dateTime , String disease ,String treatement, boolean paid){
		this.doctor = doctor;
		this.patient = patient;
		this.dateTime = dateTime;
		this.disease = disease;
		this.treatement= treatement;
		this.paid=paid;
	}
	
	public int getId(){return id;}
	public Doctor getDoctor(){return doctor;}
	public Patient getPatient(){return patient;}
	public LocalDateTime getDateTime(){return dateTime;}
	public String getDisease(){return disease;}
	public String getTreatement(){return treatement;}
	public boolean getPaid(){return paid;}
}
