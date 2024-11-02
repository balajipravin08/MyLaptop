package Controller;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;



class ConnectionFailed extends SQLException{
    ConnectionFailed(String s){
        super(s);
    }
}

public class ConnectionDB {
    private static Connection con = null;
    private ConnectionDB(){}
    public static Connection getConnection() throws ConnectionFailed {
        if(con!=null) return con;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/movie_ticket_booking","postgres","zoho");
            return con;
        } catch (Exception e) {
            throw new ConnectionFailed("Connection Failed");
        }
    }
    public static int  executeUpdate(String query , Object[] values){
        int row = 0;
        try{
            PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(query);
            for(int i=0;i<values.length;i++){
                pst.setObject(i+1 , values[i]);
            }
            row = pst.executeUpdate();
        }catch (SQLException e ){
            System.out.println("Statement Not Executed");
        }
        return row;
    }
    
    public static List <Map<String,Object>> executeQuerys (String query , Object[] values) throws SQLException{
		List <Map<String,Object>> records = new ArrayList<>();
		ResultSet rs = ConnectionDB.executeQuery(query , values);	
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		while(rs.next()){
			Map<String,Object> row = new LinkedHashMap<>();
			for(int i=1;i<=columnCount ;i++){
				row.put(rsmd.getColumnName(i) , rs.getObject(i));
			}
			records.add(row);
		}
		return records;
	}

    public static ResultSet executeQuery(String query , Object[] values) throws SQLException {
        ResultSet rs = null;
        try{
            PreparedStatement pst = ConnectionDB.getConnection().prepareStatement(query);
            for(int i=0;i<values.length;i++){pst.setObject(i+1 , values[i]);}
            rs = pst.executeQuery();
        }catch (SQLException e ){System.out.println("Statement Not Executed");}
        return rs;

    }
    public static void close() throws SQLException {
        con.close();
    }
}
