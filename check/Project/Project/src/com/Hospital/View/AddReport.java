package com.Hospital.View;

import com.Hospital.Controller.Create;
import com.Hospital.Controller.Read;
import com.Hospital.Model.Doctor;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Report;
import com.Hospital.Model.User;
import java.time.LocalDate;
import java.util.Scanner;

public class AddReport implements Operations {

    private Scanner sc = MyScanner.getScannerInstance();

    public void operation(User user) {
        Report report = new Report();
        report.setDoctor((Doctor) user);

        System.out.println("Enter patient ID (-1 to show all patients):");
        int patientId = sc.nextInt();
        while (patientId<0) {
            new ViewPatients().operation(user);
            System.out.println("Enter patient ID (-1 to show all patients):");
            patientId = sc.nextInt();
            sc.nextLine();
        }
        report.setPatient(Read.getInstance().getPatients(patientId));
        report.setDate(LocalDate.now());
        System.out.println("Enter disease :");
        report.setDisease(sc.next());
        System.out.println("Enter treatment :");
        report.setTreatment(sc.next());
        report.setPaid(true);

        System.out.print("---------------------------------------------\n");
        System.out.print(String.format("|%-20s : %-20s|\n", "Doctor Name",  report.getDoctorName()));
        System.out.print(String.format("|%-20s : %-20s|\n", "Patient Name",  report.getPatientName()));
        System.out.print(String.format("|%-20s : %-20s|\n", "Date", report.getDate()));
        System.out.print(String.format("|%-20s : %-20s|\n", "Disease", report.getDisease()));
        System.out.print(String.format("|%-20s : %-20s|\n", "Treatment",  report.getTreatment()));
        System.out.print(String.format("|%-20s : %-20s|\n", "Paid",  report.isPaid()));
        System.out.print("---------------------------------------------\n");

        System.out.println("\nAre you sure that you want to continue?\n"
                + "These data cannot be updated later\n"
                + "1. Continue");
        if (sc.nextInt()==1) {
            if (Create.getInstance().addReport(report)) {
                System.out.println("Report created successfully");
            }
        }
    }

    public String getName() {
        return "Add Report";
    }
}
