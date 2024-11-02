package com.Hospital.View.DoctorView;

import com.Hospital.Controller.DoctorController.GetDoctorReport;
import com.Hospital.Controller.SignIn;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Report;
import com.Hospital.Model.User;
import com.Hospital.View.MyScanner;
import com.Hospital.View.AdminView.ViewPatients;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewDoctorReports implements Operations {
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
        ArrayList<Report> reports  = new GetDoctorReport().getReports(patientId, SignIn.getInstance().getUser().getId());
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
        return "View My Reports";
    }
}
