package com.Hospital.View;

import com.Hospital.Controller.DatabaseController.DataBase;
import com.Hospital.Model.Operations;
import com.Hospital.Model.User;

import java.util.Scanner;

public class LogOut implements Operations {
    private Scanner sc = MyScanner.getScannerInstance();
    public void operation(User user) {
        System.out.println("1.Login\n2.Exit");
        if(sc.nextInt()==1) new Login().login();
        else {
            DataBase.close();
            MyScanner.close();
            System.out.println("ThankYou");
            System.exit(0);
        }
    }

    public String getName() {
        return "Logout";
    }
}
