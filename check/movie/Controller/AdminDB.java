package Controller;

import Model.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDB {

    private AdminDB(){}

    public static List display() throws SQLException{
        Object[] values = {};
        ArrayList<User> list = new ArrayList<>();
        ResultSet rs = ConnectionDB.executeQuery(SQLQueries.DISPLAY_ADMIN_INFO , values);
        while(rs.next()){
            list.add(new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getLong(4)));
        }
        return list;
    }
    public static int update (String query, String value, int id) throws SQLException {
        Object[] values = {value,id};
        return ConnectionDB.executeUpdate(query, values);
        
    }
    public static int delete(String value)throws SQLException{
          Object[] values = {value};
        return ConnectionDB.executeUpdate(SQLQueries.DELETE_ADMIN_INFO , values);
    }
    
    public static int getId(String email) throws SQLException{
    	Object[] values = {email};
    	ResultSet rs = ConnectionDB.executeQuery(SQLQueries.ADMIN_GET_ID , values);
    	rs.next() ;
    	return rs.getInt(1) ;
    }
    public static void add(Admin user) throws SQLException{
            Object[] values = {user.getName(),user.getEmail(),user.getMobileNo()};
        ConnectionDB.executeUpdate(SQLQueries.ADD_ADMIN , values );
    }
}
