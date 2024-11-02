package com.Hospital.View.CashierView;

import com.Hospital.Controller.CashierController.UpdateCashier;
import com.Hospital.Controller.AdminController.GetEmployees;
import com.Hospital.Controller.SignIn;
import com.Hospital.Model.Cashier;
import com.Hospital.Model.Employee;
import com.Hospital.Model.Operations;
import com.Hospital.Model.User;
import com.Hospital.Validation.ValidateCheck;
import com.Hospital.View.MyScanner;

import java.util.Scanner;

public class EditCashier extends ValidateCheck implements Operations {

    private Scanner sc = MyScanner.getScannerInstance();

    public void operation(User user) {

        Employee employee = new GetEmployees().getEmployees(SignIn.getInstance().getUser().getId());
        System.out.println("Enter name (-1 to keep old value and 1 to change old value):");
        String name = sc.next();
        if (!name.equals("-1")) {
            name = sc.next();
            employee.setName(name);
        }

        System.out.println("Enter email (-1 to keep old value and 1 to change old value):");
        String email = sc.next();
        if (!email.equals("-1")){
            email = getValidatedEmail("Enter Email to Change : ");
            employee.setEmail(email);
        }

        System.out.println("Enter password (-1 to keep old value and 1 to change old value):");
        String password = sc.next();
        if (!password.equals("-1")) {
            password = getValidatedPassword("Enter Password to change : ");
            employee.setPassword(password);
        }

        System.out.println("Enter phone number (-1 to keep old value and 1 to change old value):");
        String mobileNo = sc.next();
        if (!mobileNo.equals("-1")){
            mobileNo = getValidatedMobileNumber("Enter Mobile Number To Change : ");
            employee.setMobileNo(mobileNo);
        }

         employee = new Cashier(employee.getId(),employee.getName(),employee.getLocation(),employee.getEmail(),employee.getMobileNo(),employee.getPassword(),employee.getSalary());

        if (new UpdateCashier().updateCashier(employee)>0) {
            System.out.println("Cashier updated successfully");
        }else {
            System.out.println("Cashier Not Updated");
        }
    }

    public String getName() {
        return "Edit Cashier";
    }
}
