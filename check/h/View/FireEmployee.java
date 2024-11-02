package com.Hospital.View;

import com.Hospital.Controller.DeleteEmployee;
import com.Hospital.Model.Operations;
import com.Hospital.Model.User;

import java.util.Scanner;

public class FireEmployee implements Operations {
    private Scanner sc = MyScanner.getScannerInstance();
    public void Operation(User user) {
        System.out.println("Enter Employee id (-1 to show all employees):");
        int id = sc.nextInt();
        while (id<0) {
            new ViewEmployees().Operation(user);
            System.out.println("Enter Employee ID (-1 to show all employees):");
            id = sc.nextInt();
        }
        if (DeleteEmployee.getInstance().deleteEmployee(id)>0) {
            System.out.println("Employee deleted successfully");
        }
    }

    public String getName() {
        return "Fire Employee";
    }
}
