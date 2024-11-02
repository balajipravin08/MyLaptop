package com.Hospital.View.PatientView;

import com.Hospital.Controller.PatientController.GetPatientReport;
import com.Hospital.Controller.SignIn;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Report;
import com.Hospital.Model.User;
import com.Hospital.View.MyScanner;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewPatientReports implements Operations {

    private Scanner sc = MyScanner.getScannerInstance();
    public void operation(User user) {
        ArrayList<Report> reports  = new GetPatientReport().getReports(SignIn.getInstance().getUser().getId());
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
