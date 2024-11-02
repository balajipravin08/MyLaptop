package com.Hospital.View;
import com.Hospital.Controller.DeletePatient;
import com.Hospital.Model.Operations;
import com.Hospital.Model.User;

import java.util.Scanner;

public class RemovePatient implements Operations {
    private Scanner sc = MyScanner.getScannerInstance();
    public void Operation(User user) {
        System.out.println("Enter Patient id (-1 to show all Patient):");
        int id = sc.nextInt();
        while (id<0) {
            new ViewPatients().Operation(user);
            System.out.println("Enter Patient ID (-1 to show all Patient):");
            id = sc.nextInt();
        }
        if (DeletePatient.getInstance().deletePatient(id)>0) {
            System.out.println("Patient deleted successfully");
        }
    }

    public String getName() {
        return "Remove Patient";
    }
}
