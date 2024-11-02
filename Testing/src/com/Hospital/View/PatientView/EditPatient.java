package com.Hospital.View.PatientView;

import com.Hospital.Controller.PatientController.GetPatient;
import com.Hospital.Controller.PatientController.UpdatePatient;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Patient;
import com.Hospital.Model.User;
import com.Hospital.Validation.ValidateCheck;
import com.Hospital.View.MyScanner;
import com.Hospital.View.AdminView.ViewPatients;

import java.util.Scanner;

public class EditPatient extends ValidateCheck implements Operations {
    private Scanner sc = MyScanner.getScannerInstance();
    public void operation(User user) {
        System.out.println("Enter Patient id (-1 to show all patients):");
        int id = sc.nextInt();
        while (id<0) {
            new ViewPatients().operation(user);
            System.out.println("Enter Patient id (-1 to show all patients):");
            id = sc.nextInt();
        }

        Patient patient = new GetPatient().getPatients(id);
        System.out.println("Enter name (-1 to keep old value and 1 to change old value):");
        String name = sc.next();
        if (!name.equals("-1")) {
            name = sc.next();
            patient.setName(name);
        }

        System.out.println("Enter email (-1 to keep old value and 1 to change old value):");
        String email = sc.next();
        if (!email.equals("-1")){
            email = getValidatedEmail("Enter Email to Change : ");
            patient.setEmail(email);
        }

        System.out.println("Enter password (-1 to keep old value and 1 to change old value):");
        String password = sc.next();
        if (!password.equals("-1")) {
            password = getValidatedPassword("Enter Password to change : ");
            patient.setPassword(password);
        }

        System.out.println("Enter phone number (-1 to keep old value and 1 to change old value):");
        String mobileNo = sc.next();
        if (!mobileNo.equals("-1")){
            mobileNo = getValidatedMobileNumber("Enter Mobile Number To Change : ");
            patient.setMobileNo(mobileNo);
        }

        System.out.println("Enter blood group (-1 to keep old value and 1 to change old value):");
        String bloodGroup = sc.next();
        if (!bloodGroup.equals("-1")){
            bloodGroup = sc.next();
            patient.setBloodGroup(bloodGroup);
        }

        if(new UpdatePatient().updatePatient(patient)>0){
            System.out.println("Patient updated successfully");
        }else {
            System.out.println("Patient Not Updated");
        }
    }

    public String getName() {
        return "Edit Patient";
    }
}
