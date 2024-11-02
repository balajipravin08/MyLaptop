package com.Hospital.View;

import com.Hospital.Controller.Read;
import com.Hospital.Controller.Update;
import com.Hospital.Model.*;

import java.util.Scanner;

public class EditEmployee implements Operations {

    private Scanner sc = MyScanner.getScannerInstance();

    public void operation(User user) {
        System.out.println("Enter Employee ID (int):\n(-1 to show all Employees)");
        int id = sc.nextInt();

        while (id<0){
            new ViewEmployees().operation(user);
            System.out.println("Enter Employee ID (int):\n(-1 to show all Employees)");
            id = sc.nextInt();
        }
        Employee employee = Read.getInstance().getEmployees(id);
        System.out.println("Enter name (-1 to keep old value):");
        String name = sc.next();
        if (!name.equals("-1")) employee.setName(name);

        System.out.println("Enter email (-1 to keep old value):");
        String email = sc.next();
        if (!email.equals("-1")) employee.setEmail(email);

        System.out.println("Enter password (-1 to keep old value):");
        String password = sc.next();
        if (!password.equals("-1")) employee.setPassword(password);

        System.out.println("Enter phone number (-1 to keep old value):");
        String mobileNo = sc.next();
        if (!mobileNo.equals("-1")) employee.setMobileNo(mobileNo);

        System.out.println("Enter salary (-1 to keep old value):");
        long salary = sc.nextLong();
        if (salary!=-1) employee.setSalary(salary);

        String specialist="";
        if (employee.getJobId()==0) {
            System.out.println("Enter specialist (-1 to keep old value):");
            specialist = sc.next();
            if (!specialist.equals("-1"))((Doctor) employee).setSpecialist(specialist);
        }
//name,location,email,mobileNo,password,salary,specialist
        switch (employee.getJobId()){
            case 0:
                employee=new Doctor(employee.getId(),employee.getName(),employee.getLocation(),employee.getEmail(),employee.getMobileNo(),employee.getPassword(),employee.getSalary(),specialist);
                break;
            case 1:
                employee=new Cashier(employee.getId(),employee.getName(),employee.getLocation(),employee.getEmail(),employee.getMobileNo(),employee.getPassword(),employee.getSalary());
                break;
            case 2:
                employee=new Receptionist(employee.getId(),employee.getName(),employee.getLocation(),employee.getEmail(),employee.getMobileNo(),employee.getPassword(),employee.getSalary());
                break;
            default:break;
        }
        if (Update.getInstance().updateEmployee(employee)>0) {
            System.out.println("Employee updated successfully");
        }else {
            System.out.println("Employee Not Updated");
        }
    }

    public String getName() {
        return "Edit Employee";
    }
}
