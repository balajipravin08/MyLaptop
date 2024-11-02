package com.Hospital.View.PatientView;

import com.Hospital.Controller.PatientController.GetPatient;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Patient;
import com.Hospital.Model.User;
import com.Hospital.View.MyScanner;
import com.Hospital.View.AdminView.ViewPatients;

import java.util.Scanner;

public class ViewPatientData implements Operations {
    private Scanner sc = MyScanner.getScannerInstance();

    public void operation(User user) {

        System.out.println("Enter patient ID (-1 to show all patients):");
        int patientId = sc.nextInt();
        while (patientId<0) {
            new ViewPatients().operation(user);
            System.out.println("Enter patient ID (-1 to show all patients):");
            patientId = sc.nextInt();
            sc.nextLine();
        }

        Patient patient = new GetPatient().getPatients(patientId);

        System.out.print("---------------------------------------------\n");
        System.out.print(String.format("|%-20s : %-20s|\n", "Id",  patient.getId()));
        System.out.print(String.format("|%-20s : %-20s|\n", "Name",  patient.getName()));
        System.out.print(String.format("|%-20s : %-20s|\n", "Location", patient.getLocation()));
        System.out.print(String.format("|%-20s : %-20s|\n", "Email",  patient.getEmail()));
        System.out.print(String.format("|%-20s : %-20s|\n", "MobileNo",  patient.getMobileNo()));
        System.out.print(String.format("|%-20s : %-20s|\n", "BloodGroup",  patient.getBloodGroup()));
        System.out.print("---------------------------------------------\n");
    }

    public String getName() {
        return "View Patient Data";
    }
}
