import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

	public static int executeUpdate(String query){
		int row = 0;
		try(PreparedStatement pst = con.prepareStatement(query)){
			row = pst.executeUpdate();
		}catch(SQLException e){
			System.out.println("Statement not Created "+e.getMessage());
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
		}catch (SQLException e ){System.out.println("Statement Not Executed");}
		return rs;
	}

	public static void main(String[] args) {
		int i = executeUpdate(Queries.ADD_SUPER_ADMIN.getQuery());
		executeUpdate(Queries.CREATE_EMPLOYEE.getQuery());
		executeUpdate(Queries.CREATE_PATIENT.getQuery());
		executeUpdate(Queries.CREATE_APPOINTMENT.getQuery());
		executeUpdate(Queries.CREATE_RECEIPT.getQuery());
		executeUpdate(Queries.CREATE_REPORT.getQuery());
		executeUpdate(Queries.CREATE_TREATMENT.getQuery());
		System.out.println(i);
	}
} 
