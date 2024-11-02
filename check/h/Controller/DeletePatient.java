package com.Hospital.Controller;

public class DeletePatient {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private DeletePatient(){}
    private static DeletePatient deletePatient = null;
    public static DeletePatient getInstance(){
        if (deletePatient ==null) deletePatient =new DeletePatient();
        return deletePatient;
    }

    public int deletePatient(int id){
        Object[] values = new Object[]{id};
        return dbo.executeUpdate(Queries.DELETE_PATIENT.getQuery(),values);
    }
}
