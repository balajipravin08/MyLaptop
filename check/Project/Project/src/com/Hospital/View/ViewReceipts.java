package com.Hospital.View;


import com.Hospital.Controller.Read;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Receipt;
import com.Hospital.Model.User;

import java.util.ArrayList;

public class ViewReceipts implements Operations {
    private Read read = Read.getInstance();

    public void operation(User user) {

        ArrayList<Receipt> receipts = read.getReceipts();

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
        return "View All Receipt";
    }
}