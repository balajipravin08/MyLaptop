package com.Hospital.Controller;

public class DeleteEmployee {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private DeleteEmployee(){}
    private static DeleteEmployee deleteEmployee = null;
    public static DeleteEmployee getInstance(){
        if (deleteEmployee ==null) deleteEmployee =new DeleteEmployee();
        return deleteEmployee;
    }

    public int deleteEmployee(int id){
            Object[] values = new Object[]{id};
            return dbo.executeUpdate(Queries.DELETE_EMPLOYEE.getQuery(),values);
    }
}
