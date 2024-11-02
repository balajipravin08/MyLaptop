package com.Hospital.View;

import com.Hospital.Controller.Read;
import com.Hospital.Controller.SignIn;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Treatment;
import com.Hospital.Model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewDoctorTreatment implements Operations {

    private Scanner sc = MyScanner.getScannerInstance();
    private Read read = Read.getInstance();

    public void operation(User user) {
        System.out.println("Enter patient ID (-1 to show all patients):");
        int patientId = sc.nextInt();
        while (patientId<0) {
            new ViewPatients().operation(user);
            System.out.println("Enter patient ID (-1 to show all patients):");
            patientId = sc.nextInt();
            sc.nextLine();
        }
        ArrayList<Treatment> treatments  = read.getTreatments(patientId, SignIn.getInstance().getUser().getId());
        for (Treatment treatment : treatments) {
            System.out.print("---------------------------------------------\n");
            System.out.print(String.format("|%-20s : %-20s|\n", "Id",  treatment.getId()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Doctor Name",  treatment.getDoctorName()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Patient Name", treatment.getPatientName()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Date",  treatment.getDate()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Paid",  treatment.isPaid()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Disease",  treatment.getDisease()));
            System.out.print("---------------------------------------------\n");
        }
    }

    public String getName() {
        return "View My Treatments";
    }
}
