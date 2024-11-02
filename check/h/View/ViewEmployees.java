package com.Hospital.View;
import com.Hospital.Controller.ReadEmployee;
import com.Hospital.Model.Employee;
import com.Hospital.Model.User;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Doctor;
import java.util.ArrayList;

public class ViewEmployees implements Operations {
	
	private ReadEmployee readEmployee = ReadEmployee.getInstance();
	
	public void Operation(User user){
		
		ArrayList<Employee> employees = readEmployee.getEmployees();
		
		for(Employee e : employees){
			System.out.print("---------------------------------------------\n");
			System.out.print(String.format("|%-20s : %-20s|\n", "Id",  e.getId()));
			System.out.print(String.format("|%-20s : %-20s|\n", "Name",  e.getName()));
			System.out.print(String.format("|%-20s : %-20s|\n", "Location", e.getLocation()));
			System.out.print(String.format("|%-20s : %-20s|\n", "Email",  e.getEmail()));
			System.out.print(String.format("|%-20s : %-20s|\n", "MobileNo",  e.getMobileNo()));
			System.out.print(String.format("|%-20s : %-20s|\n", "Salary",  e.getSalary()));
			System.out.print(String.format("|%-20s : %-20s|\n", "Job",  e.getJobName()));
			if(e.getJobId()==0)
			System.out.print(String.format("|%-20s : %-20s|\n", "Specialist",  ((Doctor)e).getSpecialist()));
			System.out.print("---------------------------------------------\n");
		}
	}
	
	public String getName(){
		return "View All Employees";
	}
}
/*
id,name,location,email,mobile,salary,specialist
System.out.("----------------------------------------\n");
		sb.append(String.format("|%-15s : %-20s|\n", "Id",  getId()));
		sb.append(String.format("|%-15s : %-20s|\n", "Name",  getName()));
		sb.append(String.format("|%-15s : %-20s|\n", "Email",  getEmail()));
		sb.append(String.format("|%-15s : %-20s|\n", "Mobile no",  getMobileNo()));
		sb.append("----------------------------------------\n");*/
