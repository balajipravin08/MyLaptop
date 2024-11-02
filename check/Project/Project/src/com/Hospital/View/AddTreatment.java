package com.Hospital.View;
import com.Hospital.Controller.Create;
import com.Hospital.Controller.Read;
import com.Hospital.Model.Doctor;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Treatment;
import com.Hospital.Model.User;

import java.time.LocalDate;
import java.util.Scanner;

public class AddTreatment implements Operations {
		
		private Scanner sc = MyScanner.getScannerInstance();

		public void operation(User user){
			Treatment treatment = new Treatment();
			
			treatment.setDoctor((Doctor)user);
			
			System.out.println("Enter patient ID (-1 to show all patients):");
			int patientId = sc.nextInt();
				while (patientId<0) {
					new ViewPatients().operation(user);
					System.out.println("Enter patient ID (-1 to show all patients):");
					patientId = sc.nextInt();
				}
				sc.nextLine();
				treatment.setPatient(Read.getInstance().getPatients(patientId));
				treatment.setDate(LocalDate.now());
				treatment.setPaid(true);
				System.out.println("Enter disease:");
				treatment.setDisease(sc.next());
		
				System.out.println("\nDoctor:\t\t"+treatment.getDoctor().getName());
				System.out.println("Patient:\t"+treatment.getPatient().getName());
				System.out.println("Date:\t"+treatment.getDate());
				System.out.println("Paid:\t\t"+treatment.isPaid());
				System.out.println("Disease:\t"+treatment.getDisease());

				System.out.println("\nAre you sure that you want to continue?\n"
					+ "These data cannot be updated later\n"
					+ "1.Paid");
				if (sc.nextInt()==1) {
					treatment.setPaid(true);
					if (Create.getInstance().addTreatment(treatment)) {
						System.out.println("Treatment added successfully");
					}

				}
		}
		
		public String getName(){
			return "Add Treatment";
		}
	
}
