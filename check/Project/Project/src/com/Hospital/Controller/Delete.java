package com.Hospital.Controller;

public class Delete {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private static Delete delete = null;
    private Delete(){}
    public static Delete getInstance(){
        if(delete == null) delete = new Delete();
        return delete;
    }
    public int deleteEmployee(int id){
        Object[] values = new Object[]{id};
        return dbo.executeUpdate(Queries.DELETE_EMPLOYEE.getQuery(),values);
    }

    public int deletePatient(int id) {
        Object[] values = new Object[]{id};
        return dbo.executeUpdate(Queries.DELETE_PATIENT.getQuery(), values);
    }
}
