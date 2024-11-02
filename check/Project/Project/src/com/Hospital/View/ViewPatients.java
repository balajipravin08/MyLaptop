package com.Hospital.View;
import com.Hospital.Controller.Read;
import com.Hospital.Model.User;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Patient;
import java.util.ArrayList;

public class ViewPatients implements Operations {
	
	private Read read = Read.getInstance();
	
	public void operation(User user){
		
		ArrayList<Patient> patients = read.getPatients();
		
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
