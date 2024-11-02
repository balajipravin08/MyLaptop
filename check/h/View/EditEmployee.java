package com.Hospital.View;

import com.Hospital.Controller.ReadEmployee;
import com.Hospital.Controller.UpdateEmployee;
import com.Hospital.Model.*;

import java.util.Scanner;

public class EditEmployee implements Operations {

    private Scanner sc = MyScanner.getScannerInstance();

    public void Operation(User user) {
        System.out.println("Enter Employee ID (int):\n(-1 to show all Employees)");
        int id = sc.nextInt();

        while (id<0){
            new ViewEmployees().Operation(user);
            System.out.println("Enter Employee ID (int):\n(-1 to show all Employees)");
            id = sc.nextInt();
        }
        Employee e = ReadEmployee.getInstance().getEmployees(id);
        System.out.println("Enter name (-1 to keep old value):");
        String name = sc.next();
        if (!name.equals("-1")) e.setName(name);

        System.out.println("Enter email (-1 to keep old value):");
        String email = sc.next();
        if (!email.equals("-1")) e.setEmail(email);

        System.out.println("Enter phone number (-1 to keep old value):");
        String mobileNo = sc.next();
        if (!mobileNo.equals("-1")) e.setMobileNo(mobileNo);

        System.out.println("Enter salary (-1 to keep old value):");
        long salary = sc.nextLong();
        if (salary!=-1) e.setSalary(salary);

        String specialist="";
        if (e.getJobId()==0) {
            System.out.println("Enter specialist (-1 to keep old value):");
            specialist = sc.next();
            if (!specialist.equals("-1"))((Doctor) e).setSpecialist(specialist);
        }
//name,location,email,mobileNo,password,salary,specialist
        switch (e.getJobId()){
            case 0:
                e=new Doctor(e.getId(),e.getName(),e.getLocation(),e.getEmail(),e.getMobileNo(),e.getPassword(),e.getSalary(),specialist);
                break;
            case 1:
                e=new Cashier(e.getId(),e.getName(),e.getLocation(),e.getEmail(),e.getMobileNo(),e.getPassword(),e.getSalary());
                break;
            case 2:
                e=new Receptionist(e.getId(),e.getName(),e.getLocation(),e.getEmail(),e.getMobileNo(),e.getPassword(),e.getSalary());
                break;
            default:break;
        }
        if (UpdateEmployee.getInstance().updateEmployee(e)>0) {
            System.out.println("Employee updated successfully");
        }else {
            System.out.println("Employee Not Updated");
        }
    }

    public String getName() {
        return "Edit Employee";
    }
}
