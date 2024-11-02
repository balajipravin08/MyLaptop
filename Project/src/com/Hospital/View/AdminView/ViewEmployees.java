package com.Hospital.View.AdminView;
import com.Hospital.Controller.AdminController.GetEmployees;
import com.Hospital.Model.Employee;
import com.Hospital.Model.User;
import com.Hospital.Model.Operations;
import com.Hospital.Model.Doctor;
import java.util.ArrayList;

public class ViewEmployees implements Operations {

	public void operation(User user){
		
		ArrayList<Employee> employees = new GetEmployees().getEmployees();
		
		for(Employee employee : employees){
			System.out.print("--------------------------------------------------\n");
			System.out.print(String.format("|%-20s : %-25s|\n", "Id",  employee.getId()));
			System.out.print(String.format("|%-20s : %-25s|\n", "Name",  employee.getName()));
			System.out.print(String.format("|%-20s : %-25s|\n", "Location", employee.getLocation()));
			System.out.print(String.format("|%-20s : %-25s|\n", "Email",  employee.getEmail()));
			System.out.print(String.format("|%-20s : %-25s|\n", "MobileNo",  employee.getMobileNo()));
			System.out.print(String.format("|%-20s : %-25s|\n", "Salary",  employee.getSalary()));
			System.out.print(String.format("|%-20s : %-25s|\n", "Job",  employee.getJobName()));
			if(employee.getJobId()==0) System.out.print(String.format("|%-20s : %-25s|\n", "Specialist",  ((Doctor)employee).getSpecialist()));
			System.out.print("--------------------------------------------------\n");
		}
	}
	
	public String getName(){
		return "View All Employees";
	}
}

