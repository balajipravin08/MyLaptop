package com.Hospital.View.PatientView;
import com.Hospital.Controller.PatientController.GetPatientTreatment;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Treatment;
import com.Hospital.Model.User;
import com.Hospital.View.MyScanner;
import com.Hospital.View.AdminView.ViewPatients;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewPatientTreatment implements Operations {

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
        ArrayList<Treatment> treatments  = new GetPatientTreatment().getTreatments(patientId);
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
        return "View Patient Treatment";
    }
}
