package com.Hospital.View.PatientView;

import com.Hospital.Controller.PatientController.GetPatient;
import com.Hospital.Controller.SignIn;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Patient;
import com.Hospital.Model.User;
import com.Hospital.View.MyScanner;
import com.Hospital.View.AdminView.ViewPatients;

import java.util.Scanner;

public class ViewPatientData implements Operations {
    private Scanner sc = MyScanner.getScannerInstance();

    public void operation(User user) {

        Patient patient = new GetPatient().getPatients(SignIn.getInstance().getUser().getId());

        System.out.print("---------------------------------------------\n");
        System.out.print(String.format("|%-20s : %-20s|\n", "Id",  patient.getId()));
        System.out.print(String.format("|%-20s : %-20s|\n", "Name",  patient.getName()));
        System.out.print(String.format("|%-20s : %-20s|\n", "Location", patient.getLocation()));
        System.out.print(String.format("|%-20s : %-20s|\n", "Email",  patient.getEmail()));
        System.out.print(String.format("|%-20s : %-20s|\n", "MobileNo",  patient.getMobileNo()));
        System.out.print(String.format("|%-20s : %-20s|\n", "BloodGroup",  patient.getBloodGroup()));
        System.out.print("---------------------------------------------\n");
    }

    public String getName() {
        return "View Patient Data";
    }
}
