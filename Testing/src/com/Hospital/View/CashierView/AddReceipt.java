package com.Hospital.View.CashierView;

import com.Hospital.Controller.CashierController.CreateReceipt;
import com.Hospital.Controller.AdminController.GetPatients;
import com.Hospital.Model.*;
import com.Hospital.View.MyScanner;
import com.Hospital.View.PatientView.ViewPatientTreatment;
import com.Hospital.View.AdminView.ViewPatients;

import java.util.Scanner;

public class AddReceipt implements Operations {
    private Scanner sc = MyScanner.getScannerInstance();

    public void operation(User user) {

        Receipt receipt = new Receipt();
        receipt.setCashier((Cashier)user);
        System.out.println("Enter patient ID (-1 to show all patients):");
        int patientId = sc.nextInt();
        while (patientId<0) {
            new ViewPatients().operation(user);
            System.out.println("Enter patient ID (-1 to show all patients):");
            patientId = sc.nextInt();
        }
        Patient patient = new GetPatients().getPatients(patientId);
        receipt.setPatient(patient);
        System.out.println("Enter Treatment ID (-1 to show all Treatment):");
        int treatmentId = sc.nextInt();
        while (treatmentId<0){
            new ViewPatientTreatment().operation(patient);
            System.out.println("Enter Treatment ID (-1 to show all Treatment):");
            treatmentId = sc.nextInt();
        }
        receipt.setTreatmentId(treatmentId);
        System.out.println("Enter amount (double):");
        long amount = sc.nextLong();
        receipt.setAmount(amount);

        System.out.print("---------------------------------------------\n");
        System.out.print(String.format("|%-20s : %-20s|\n", "Cashier Name",  receipt.getCashierName()));
        System.out.print(String.format("|%-20s : %-20s|\n", "Patient Name",  receipt.getPatientName()));
        System.out.print(String.format("|%-20s : %-20s|\n", "Treatment Id",  receipt.getTreatmentId()));
        System.out.print(String.format("|%-20s : %-20s|\n", "Amount", receipt.getAmount()));
        System.out.print("---------------------------------------------\n");
        System.out.println("These data cannot be edited later\n1. Continue");
        if (sc.nextInt()==1) {
            sc.nextLine();
            if (new CreateReceipt().addReceipt(receipt)) {
                System.out.println("Receipt paid successfully");
            }
            else {
                System.out.println("Receipt paid successfully");
            }
        }
    }

    public String getName() {
        return "Add Receipt";
    }
}
