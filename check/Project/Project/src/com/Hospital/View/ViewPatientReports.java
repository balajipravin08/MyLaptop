package com.Hospital.View;

import com.Hospital.Controller.Read;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Report;
import com.Hospital.Model.User;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewPatientReports implements Operations {

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
        ArrayList<Report> reports  = read.getReports(patientId);
        for (Report report : reports) {
            System.out.print("---------------------------------------------\n");
            System.out.print(String.format("|%-20s : %-20s|\n", "Id",  report.getId()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Doctor Name",  report.getDoctorName()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Patient Name", report.getPatientName()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Date",  report.getDate()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Disease",  report.getDisease()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Treatment",  report.getTreatment()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Paid",  report.isPaid()));
            System.out.print("---------------------------------------------\n");
        }
    }

    public String getName() {
        return "View Patient Reports";
    }
}
