package com.Hospital.Controller.CashierController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Receipt;

public class CreateReceipt {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();

    public boolean addReceipt(Receipt receipt){
        Object[] values = new Object[]{receipt.getCashier().getId(),receipt.getPatient().getId(),receipt.getTreatmentId(),receipt.getAmount()};
        return dbo.executeUpdate(Queries.ADD_RECEIPT.getQuery(),values) !=0;
    }
}
