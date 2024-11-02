package com.Hospital.Model;

import com.Hospital.View.LogOut;
import com.Hospital.View.Receptionistview.*;

import java.util.Arrays;

public class Receptionist extends Employee{

    private static final int JOB_ID = 3;
    private static final String JOB_NAME = "RECEPTIONIST";

    public Receptionist(){
        super();
        assignInfo();
    }

    public Receptionist(int id , String name , String location , String email , String mobileNo , String password , long salary){
        super(id,name,location,email,mobileNo,password,salary);
        assignInfo();
    }

    public Receptionist(int id , String name , String location , String email , String mobileNo , String password){
        super(id,name,location,email,mobileNo,password);
        assignInfo();
    }

    public Receptionist(String name , String location , String email , String mobileNo , String password , long salary){
        super(name,location,email,mobileNo,password,salary);
        assignInfo();
    }

    private void assignInfo(){
        this.operations = Arrays.asList(new AddAppointment() , new ViewDoctors(),new ViewAvailableDoctors(),new ViewAppointments(),new CancelAppointment(),new LogOut());
    }


    public int getJobId(){return JOB_ID;}
    public String getJobName(){return JOB_NAME;}
}
