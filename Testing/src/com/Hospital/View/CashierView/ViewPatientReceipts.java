package com.Hospital.View.CashierView;
import com.Hospital.Controller.CashierController.GetReceipts;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Receipt;
import com.Hospital.Model.User;
import com.Hospital.View.MyScanner;
import com.Hospital.View.AdminView.ViewPatients;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewPatientReceipts implements Operations {

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
        ArrayList<Receipt> receipts = new GetReceipts().getReceipts(patientId,1);
        for(Receipt receipt : receipts){
            System.out.print("---------------------------------------------\n");
            System.out.print(String.format("|%-20s : %-20s|\n", "Id",  receipt.getId()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Cashier Name",  receipt.getCashierName()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Patient Name",  receipt.getPatientName()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Treatment Id",  receipt.getTreatmentId()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Amount",  receipt.getAmount()));
            System.out.print("---------------------------------------------\n");
        }
    }

    public String getName() {
        return "View Patients Receipts";
    }
}
