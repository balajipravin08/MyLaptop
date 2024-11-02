package com.Hospital.View.Receptionistview;

import com.Hospital.Controller.ReceptionistController.GetDoctors;
import com.Hospital.Model.Doctor;
import com.Hospital.Model.Operations;
import com.Hospital.Model.User;

import java.util.ArrayList;

public class ViewDoctors implements Operations {

    private ArrayList<Doctor> doctors ;

    public void operation(User user) {
        doctors = new GetDoctors().getDoctors();

        for (Doctor doctor : doctors){
            System.out.print("---------------------------------------------\n");
            System.out.print(String.format("|%-20s : %-20s|\n", "Id",  doctor.getId()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Name",  doctor.getName()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Location", doctor.getLocation()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Email",  doctor.getEmail()));
            System.out.print(String.format("|%-20s : %-20s|\n", "MobileNo",  doctor.getMobileNo()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Salary",  doctor.getSalary()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Job",  doctor.getJobName()));
            System.out.print(String.format("|%-20s : %-20s|\n", "Specialist",  doctor.getSpecialist()));
            System.out.print("---------------------------------------------\n");
        }
    }

    public String getName() {
        return "View Doctors";
    }
}
