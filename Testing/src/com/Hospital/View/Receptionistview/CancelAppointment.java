package com.Hospital.View.Receptionistview;

import com.Hospital.Controller.ReceptionistController.DeleteAppointment;
import com.Hospital.Model.Operations;
import com.Hospital.Model.User;
import com.Hospital.View.AdminView.ViewPatients;
import com.Hospital.View.MyScanner;

import java.util.Scanner;

public class CancelAppointment implements Operations {
    private Scanner sc = MyScanner.getScannerInstance();
    public void operation(User user) {
        System.out.println("Enter patient ID (-1 to show all patients):");
        int patientId = sc.nextInt();
        while (patientId<0) {
            new ViewPatients().operation(user);
            System.out.println("Enter patient ID (-1 to show all patients):");
            patientId = sc.nextInt();
        }
        if(new DeleteAppointment().deleteAppointment(patientId)!=0){
            System.out.println("Appointment Cancel Successfully");
        }else{
            System.out.println("No Appointment Available");
        }

    }

    public String getName() {
        return "Cancel Appointment";
    }
}
