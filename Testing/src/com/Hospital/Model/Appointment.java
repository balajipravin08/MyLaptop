package com.Hospital.Model;

import java.time.LocalDate;

public class Appointment {
    private int id;
    private int doctorId;
    private int patientId;
    private LocalDate date;
    private String doctorName;
    private String patientName;
    private boolean status ;

    public Appointment(int id,int doctorId, int patientId, LocalDate date,boolean status ) {
        this.id = id;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.date = date;
        this.status = status;
    }
    public Appointment(int id,String patientName,String doctorName, LocalDate date , boolean status) {
        this.id = id;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
        this.status = status;
    }

    public Appointment(int doctorId, int patientId) {
        this.doctorId = doctorId;
        this.patientId = patientId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setDoctorId(int doctorId){
        this.doctorId=doctorId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getId() {
        return id;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public LocalDate getDate() {
        return date;
    }
}
