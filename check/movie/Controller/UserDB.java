package Controller;

import Model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserDB {

    private UserDB(){}

    public static List display() throws SQLException{
        Object[] values = {};
        ArrayList<User> list = new ArrayList<>();
        try{
        		ResultSet rs = ConnectionDB.executeQuery(SQLQueries.DISPLAY_USER_INFO , values);
        		while(rs.next()){
            		list.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getLong(4)));
        		}
        }catch(SQLException e){System.out.println("User display accesed failed");}
        
        return list;
    }
    
    public static List getInfo() {
        Object[] values = {User.userId};
        ArrayList<User> list = new ArrayList<>();
        try{
        		ResultSet rs = ConnectionDB.executeQuery(SQLQueries.DISPLAY_USER , values);
        		if(rs.next()){list.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getLong(4)));}
        }catch(SQLException e){System.out.println("User display accesed failed");}
        
        return list;
    }
    public static List <Map<String,Object>> displayThretreWithMovie()throws SQLException{
		Object[] values={};
		return ConnectionDB.executeQuerys(SQLQueries.DISPLAY_THRETRE_WITH_MOVIE , values);
	}
    public static int update (String query, String value, int id) throws SQLException {
        Object[] values = {value,id};
        return ConnectionDB.executeUpdate(query, values);
        
    }
    public static int delete(String value)throws SQLException{
          Object[] values = {value};
        return ConnectionDB.executeUpdate(SQLQueries.DELETE_USER_INFO , values);
    }
    public static int getId(String email) throws SQLException{
    	Object[] values = {email};
    	ResultSet rs = ConnectionDB.executeQuery(SQLQueries.USER_GET_ID , values);
    	rs.next() ;
    	return rs.getInt(1) ;
    }
    public static void add(User user) throws SQLException{
            Object[] values = {user.getName(),user.getEmail(),user.getMobileNo()};
        ConnectionDB.executeUpdate(SQLQueries.ADD_USER , values );
    }
}
