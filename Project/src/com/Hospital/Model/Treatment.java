package com.Hospital.Model;
import java.time.LocalDate;

public class Treatment {
	private int id;
	private Doctor doctor ;
	private Patient patient;
	private LocalDate date ;
	private String disease;
	private boolean paid;
	private String doctorName;
	private String patientName;
	public Treatment(){}
	
	public Treatment(int id , Doctor doctor , Patient patient , LocalDate date , String disease , boolean paid){
		this.id = id;
		this.doctor = doctor;
		this.patient = patient;
		this.date=date;
		this.disease = disease;
		this.paid=paid;
	}

	public Treatment(int id , String doctorName , String patientName , LocalDate date , String disease , boolean paid){
		this.id = id;
		this.doctorName = doctorName;
		this.patientName = patientName;
		this.date=date;
		this.disease = disease;
		this.paid=paid;
	}


	
	public Treatment(Doctor doctor , Patient patient ,LocalDate date ,String disease , boolean paid){
		this.doctor = doctor;
		this.patient = patient;
		this.date=date;
		this.disease = disease;
		this.paid = paid;
	}
	public String getDoctorName(){return doctorName;}
	public String getPatientName(){return patientName;}
	public int getId(){return id;}
	public Doctor getDoctor(){return doctor;}
	public Patient getPatient(){return patient;}
	public LocalDate getDate(){return date;}
	public String getDisease(){return disease;}
	public boolean isPaid(){return paid;}


    public void setDoctor(Doctor doctor) {
		this.doctor=doctor;
    }

	public void setPaid(boolean paid) {
		this.paid=paid;
	}

	public void setDate(LocalDate date) {
		this.date=date;
	}

	public void setDisease(String disease) {
		this.disease=disease;
	}

	public void setPatient(Patient patient) {
		this.patient=patient;
	}
}
