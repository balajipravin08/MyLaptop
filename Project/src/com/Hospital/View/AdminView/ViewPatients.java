package com.Hospital.View.AdminView;
import com.Hospital.Controller.AdminController.GetPatients;
import com.Hospital.Model.User;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Patient;
import java.util.ArrayList;

public class ViewPatients implements Operations {

	public void operation(User user){
		
		ArrayList<Patient> patients = new GetPatients().getPatients();
		
		for(Patient patient : patients){
			System.out.print("---------------------------------------------\n");
			System.out.print(String.format("|%-20s : %-20s|\n", "Id",  patient.getId()));
			System.out.print(String.format("|%-20s : %-20s|\n", "Name",  patient.getName()));
			System.out.print(String.format("|%-20s : %-20s|\n", "Location", patient.getLocation()));
			System.out.print(String.format("|%-20s : %-20s|\n", "Email",  patient.getEmail()));
			System.out.print(String.format("|%-20s : %-20s|\n", "MobileNo",  patient.getMobileNo()));
			System.out.print(String.format("|%-20s : %-20s|\n", "BloodGroup",  patient.getBloodGroup()));
			System.out.print("---------------------------------------------\n");
		}
	}
	
	public String getName(){
		return "View All Patients";
	}
}
