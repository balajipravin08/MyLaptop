package com.Hospital.Controller;
import com.Hospital.Model.Patient;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReadPatient {
	
	private ArrayList<Patient> patients ;
	
	private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
	private static ReadPatient readPatient = null;
	private ReadPatient(){}
	public static ReadPatient getInstance(){
		if(readPatient == null) readPatient = new ReadPatient();
		return readPatient;
	}	
	
	public ArrayList<Patient> getPatients(){
		
		patients = new ArrayList<>();
		
		try{
			ResultSet rs = dbo.executeQuery(Queries.VIEW_PATIENTS.getQuery(),new Object[]{});
				while(rs.next()){
					Patient p = new Patient(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getString("bloodgroup"));
					patients.add(p);
				}
			
		}catch(SQLException e){
			System.out.println("READING PATIENTS FAILED"+e.getMessage());
		}

		return patients;
	}
	public Patient getPatients(int id){
		Patient p = null;
		try{
			ResultSet rs = dbo.executeQuery(Queries.VIEW_PATIENT.getQuery(),new Object[]{id});
			if(rs.next()){
				p = new Patient(rs.getInt("id"),rs.getString("name"),rs.getString("location"),rs.getString("email"),rs.getString("mobile"),rs.getString("password"),rs.getString("bloodgroup"));
			}

		}catch(SQLException e){
			System.out.println("READING PATIENTS FAILED"+e.getMessage());
		}

		return p;
	}
	
	
	
	
	
}
