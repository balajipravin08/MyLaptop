package com.Hospital.View.Receptionistview;

import com.Hospital.Controller.ReceptionistController.GetAppointments;
import com.Hospital.Model.Appointment;
import com.Hospital.Model.Operations;
import com.Hospital.Model.User;
import com.Hospital.View.MyScanner;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewAppointments implements Operations {
    private Scanner sc = MyScanner.getScannerInstance();
    public void operation(User user) {
        ArrayList<Appointment> appointments = new GetAppointments().getAppointments();
        for(Appointment appointment : appointments){
            System.out.print("---------------------------------------------\n");
            System.out.print(String.format("|%-20s : %-20s|\n", "Id",  appointment.getId()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Doctor Name",  appointment.getDoctorName()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Patient Name",  appointment.getPatientName()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Date",  appointment.getDate()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Status ",  appointment.isStatus()));
            System.out.print("---------------------------------------------\n");
        }
    }

    public String getName() {
        return "View All Appointments";
    }
}
