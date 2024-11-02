package com.Hospital.Controller.ReceptionistController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckDoctorAvailable {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();

    public int checkAvailable(int doctorId){
        try{
            ResultSet rs = dbo.executeQuery(Queries.GET_DOCTOR_AVAILABLE.getQuery(),new Object[]{doctorId});
            if (rs!=null){
                if (rs.next()){
                    return rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            System.out.println("Reading Doctor Available Failed "+e.getMessage());
        }
        return 0;
    }
}
