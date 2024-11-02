package com.Hospital.View.Receptionistview;

import com.Hospital.Controller.ReceptionistController.CreateAppointment;
import com.Hospital.Controller.ReceptionistController.CheckDoctorAvailable;
import com.Hospital.Model.Appointment;
import com.Hospital.Model.Operations;
import com.Hospital.Model.User;
import com.Hospital.View.AdminView.ViewPatients;
import com.Hospital.View.MyScanner;

import java.util.Scanner;

public class AddAppointment implements Operations {

    private Scanner sc = MyScanner.getScannerInstance();

    public void operation(User user) {
        System.out.println("Enter patient ID (-1 to show all patients):");
        int patientId = sc.nextInt();
        while (patientId<0) {
            new ViewPatients().operation(user);
            System.out.println("Enter patient ID (-1 to show all patients):");
            patientId = sc.nextInt();
        }

        System.out.println("Enter Doctor ID (-1 to show all Doctors):");
        int doctorId = sc.nextInt();
        while (doctorId<0) {
            new ViewAvailableDoctors().operation(user);
            System.out.println("Enter Doctor ID (-1 to show all Doctors):");
            doctorId = sc.nextInt();
        }
        if(new CheckDoctorAvailable().checkAvailable(doctorId) <= 5){
            if(new CreateAppointment().addAppointment(new Appointment(patientId,doctorId))){
                System.out.println("Appointment Booked Sucessful");
            }
        }else{
            System.out.println("Not Available");
            System.out.println("1.Change Doctor\n2.Exit");
            if (sc.nextInt()==1){
                operation(user);
            }else{
                return;
            }
        }
        sc.nextLine();

    }

    public String getName() {
        return "Add Appointment";
    }
}
