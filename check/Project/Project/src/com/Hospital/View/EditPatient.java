package com.Hospital.View;

import com.Hospital.Controller.Read;
import com.Hospital.Controller.Update;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Patient;
import com.Hospital.Model.User;

import java.util.Scanner;

public class EditPatient implements Operations {
    private Scanner sc = MyScanner.getScannerInstance();
    public void operation(User user) {
        System.out.println("Enter Patient id (-1 to show all patients):");
        int id = sc.nextInt();
        while (id<0) {
            new ViewPatients().operation(user);
            System.out.println("Enter Patient id (-1 to show all patients):");
            id = sc.nextInt();
        }

        Patient patient = Read.getInstance().getPatients(id);
        System.out.println("Enter name (-1 to keep old value):");
        String name = sc.next();
        if (!name.equals("-1")) patient.setName(name);

        System.out.println("Enter email (-1 to keep old value):");
        String email = sc.next();
        if (!email.equals("-1")) patient.setEmail(email);

        System.out.println("Enter password (-1 to keep old value):");
        String password = sc.next();
        if (!password.equals("-1")) patient.setPassword(password);

        System.out.println("Enter phone number (-1 to keep old value):");
        String mobileNo = sc.next();
        if (!mobileNo.equals("-1")) patient.setMobileNo(mobileNo);

        System.out.println("Enter blood group (-1 to keep old value):");
        String bloodGroup = sc.next();
        if (!bloodGroup.equals("-1")) patient.setBloodGroup(bloodGroup);

        if(Update.getInstance().updateEmployee(patient)>0){
            System.out.println("Patient updated successfully");
        }else {
            System.out.println("Patient Not Updated");
        }
    }

    public String getName() {
        return "Edit Patient";
    }
}
