package com.Hospital.Controller.CashierController;

import com.Hospital.Controller.DatabaseController.DataBaseOperation;
import com.Hospital.Controller.DatabaseController.Queries;
import com.Hospital.Model.Receipt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetReceipts {
    private static final DataBaseOperation dbo = DataBaseOperation.getInstance();
    private ArrayList<Receipt> receipts;

    public ArrayList<Receipt> getReceipts() {
        receipts = new ArrayList<>();

        try{
            ResultSet rs = dbo.executeQuery(Queries.VIEW_RECEIPT.getQuery(),new Object[]{});
            if (rs!=null){
                while(rs.next()){
                    Receipt receipt = new Receipt(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getLong(5));
                    receipts.add(receipt);
                }
            }
        }catch(SQLException e){
            System.out.println("READING RECEIPTS FAILED "+e.getMessage());
        }
        return receipts;
    }

    public ArrayList<Receipt> getReceipts(int id, int person) {
        receipts = new ArrayList<>();
        String query = "";
        if (person==0){
            query = Queries.VIEW_CASHIER_RECEIPT.getQuery();
        }else{
            query = Queries.VIEW_PATIENT_RECEIPT.getQuery();
        }
        try{
            ResultSet rs = dbo.executeQuery(query,new Object[]{id});
            if (rs!=null){
                while(rs.next()){
                    Receipt receipt = new Receipt(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getLong(5));
                    receipts.add(receipt);
                }
            }
        }catch(SQLException e){
            System.out.println("READING RECEIPTS FAILED "+e.getMessage());
        }
        return receipts;

    }
}
