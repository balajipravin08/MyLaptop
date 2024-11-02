package com.Hospital.View.AdminView;
import com.Hospital.Controller.AdminController.DeletePatient;
import com.Hospital.Model.Operations;
import com.Hospital.Model.User;
import com.Hospital.View.MyScanner;

import java.util.Scanner;

public class RemovePatient implements Operations {
    private Scanner sc = MyScanner.getScannerInstance();
    public void operation(User user) {
        System.out.println("Enter Patient id (-1 to show all Patient):");
        int id = sc.nextInt();
        while (id<0) {
            new ViewPatients().operation(user);
            System.out.println("Enter Patient ID (-1 to show all Patient):");
            id = sc.nextInt();
        }
        if (new DeletePatient().deletePatient(id)>0) {
            System.out.println("Patient deleted successfully");
        }
    }

    public String getName() {
        return "Remove Patient";
    }
}
