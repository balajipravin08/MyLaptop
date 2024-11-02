package com.Hospital.Controller.DatabaseController;

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
			System.out.println("Statement not Created 1"+e.getMessage());
		}
		return row;
	}

	public int executeUpdate(String query){
		int row = 0;
		try(PreparedStatement pst = con.prepareStatement(query)){
			row = pst.executeUpdate();
		}catch(SQLException e){
			System.out.println("Statement not Created 2"+e.getMessage());
		}
		return row;
	}

	public ResultSet executeQuery(String query , Object[] values){
		ResultSet rs = null;
		try{
			PreparedStatement pst = con.prepareStatement(query);
			for(int i=0;i<values.length;i++){
				pst.setObject(i+1 , values[i]);
			}
			rs = pst.executeQuery();
		}catch (SQLException e ){System.out.println("Statement Not Executed 3 "+e.getMessage());}
		return rs;
	}
} 
