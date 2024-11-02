package com.Hospital.Model;
import java.time.LocalDate;

public class Report extends Treatment{

	private String treatment;
	public Report(){}
	public Report(int id , Doctor doctor , Patient patient , LocalDate date , String disease , String treatment, boolean paid){
		super(id, doctor, patient, date, disease, paid);
		this.treatment = treatment;

	}
	public Report(int id , String doctorName , String patientName , LocalDate date , String disease ,String treatment, boolean paid){
		super(id, doctorName, patientName, date, disease, paid);
		this.treatment = treatment;

	}
	
	public Report(Doctor doctor , Patient patient , LocalDate date , String disease , String treatment, boolean paid){
		super(doctor, patient, date, disease, paid);
		this.treatment = treatment;
	}

	public String getTreatment(){return treatment;}
	public void setTreatment(String treatment){
		this.treatment=treatment;
	}
}
