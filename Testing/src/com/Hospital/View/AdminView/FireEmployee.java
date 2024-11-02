package com.Hospital.View.AdminView;
import com.Hospital.Controller.AdminController.DeleteEmployee;
import com.Hospital.Model.Operations;
import com.Hospital.Model.User;
import com.Hospital.View.MyScanner;

import java.util.Scanner;

public class FireEmployee implements Operations {
    private Scanner sc = MyScanner.getScannerInstance();
    public void operation(User user) {
        System.out.println("Enter Employee id (-1 to show all employees):");
        int id = sc.nextInt();
        while (id<0) {
            new ViewEmployees().operation(user);
            System.out.println("Enter Employee ID (-1 to show all employees):");
            id = sc.nextInt();
        }
        if (new DeleteEmployee().deleteEmployee(id)>0) {
            System.out.println("Employee deleted successfully");
        }
    }

    public String getName() {
        return "Fire Employee";
    }
}
