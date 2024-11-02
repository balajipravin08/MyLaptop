package com.Hospital.View.PatientView;
import com.Hospital.Controller.PatientController.GetPatientTreatment;
import com.Hospital.Controller.SignIn;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Treatment;
import com.Hospital.Model.User;
import com.Hospital.View.MyScanner;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewPatientTreatment implements Operations {

    private Scanner sc = MyScanner.getScannerInstance();


    public void operation(User user) {
        ArrayList<Treatment> treatments  = new GetPatientTreatment().getTreatments(SignIn.getInstance().getUser().getId());
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
