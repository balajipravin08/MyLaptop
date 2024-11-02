package com.Hospital.View;
import com.Hospital.Controller.ReadPatient;
import com.Hospital.Model.User;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Patient;
import com.Hospital.java.util.ArrayList;

public class ViewPatients implements Operations {
	
	private ReadPatient readPatients = ReadPatient.getInstance();
	
	public void Operation(User user){
		
		ArrayList<Patient> patients = readPatients.getPatients();
		
		for(Patient e : patients){
			System.out.print("---------------------------------------------\n");
			System.out.print(String.format("|%-20s : %-20s|\n", "Id",  e.getId()));
			System.out.print(String.format("|%-20s : %-20s|\n", "Name",  e.getName()));
			System.out.print(String.format("|%-20s : %-20s|\n", "Location", e.getLocation()));
			System.out.print(String.format("|%-20s : %-20s|\n", "Email",  e.getEmail()));
			System.out.print(String.format("|%-20s : %-20s|\n", "MobileNo",  e.getMobileNo()));
			System.out.print(String.format("|%-20s : %-20s|\n", "BloodGroup",  e.getBloodGroup()));
			System.out.print("---------------------------------------------\n");
		}
	}
	
	public String getName(){
		return "View All Patients";
	}
}
