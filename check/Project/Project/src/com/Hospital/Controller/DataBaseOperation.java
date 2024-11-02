package com.Hospital.Controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class DataBaseOperation{
	
	private DataBaseOperation(){}
	
	private static DataBaseOperation dbOperation = null;
	
	private static final Connection con = DataBase.getConnection();
	
	public static DataBaseOperation getInstance(){
		if(dbOperation==null) dbOperation = new DataBaseOperation();
		return dbOperation;
	}
	
	public int executeUpdate(String query , Object[] values){
		int row = 0;
		try(PreparedStatement pst = con.prepareStatement(query)){
			for(int i=1;i<=values.length;i++){
				pst.setObject(i,values[i-1]);
			}
			row = pst.executeUpdate();
		}catch(SQLException e){
			System.out.println("Statement not Created "+e.getMessage());
		}
		return row;
	}

	public static ResultSet executeQuery(String query , Object[] values){
		ResultSet rs = null;
		try{
			PreparedStatement pst = con.prepareStatement(query);
			for(int i=0;i<values.length;i++){pst.setObject(i+1 , values[i]);}
			rs = pst.executeQuery();
		}catch (SQLException e ){System.out.println("Statement Not Executed");}
		return rs;

	}

} 
