package com.Hospital.Controller.ReceptionistController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Appointment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetAppointments {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();

    private ArrayList<Appointment> appointments ;

    public ArrayList<Appointment> getAppointments(){
        appointments = new ArrayList<>();

        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_ALL_APPOINTMENT.getQuery(), new Object[]{});
            if(rs!=null){
                while (rs.next()){
                    Appointment appointment = new Appointment(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4).toLocalDate(),rs.getBoolean(5));
                    appointments.add(appointment);
                }
            }
        }catch (SQLException e){
            System.out.println("Getting Appointments Failed "+e.getMessage());
        }
        return appointments;
    }

    public ArrayList<Appointment> getAppointments(int patientId){
        appointments = new ArrayList<>();

        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_ALL_APPOINTMENT.getQuery(), new Object[]{patientId});
            if(rs!=null){
                while (rs.next()){
                    Appointment appointment = new Appointment(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4).toLocalDate(),rs.getBoolean(5));
                    appointments.add(appointment);
                }
            }
        }catch (SQLException e){
            System.out.println("Getting Appointments Failed "+e.getMessage());
        }
        return appointments;
    }
}
