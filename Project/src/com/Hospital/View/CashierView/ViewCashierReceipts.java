package com.Hospital.View.CashierView;

import com.Hospital.Controller.CashierController.GetReceipts;
import com.Hospital.Controller.SignIn;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Receipt;
import com.Hospital.Model.User;

import java.util.ArrayList;

public class ViewCashierReceipts implements Operations {
    public void operation(User user) {

        ArrayList<Receipt> receipts = new GetReceipts().getReceipts(SignIn.getInstance().getUser().getId(),0);
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
        return "View My Receipts";
    }
}
