package Controller;

import Model.Admin;
import Model.AdminCred;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminCredDB{
	public static void add(AdminCred user) throws SQLException {
        		Object[] values = {user.getId(),user.getUserName(),user.getPassword()};
        		ConnectionDB.executeUpdate(SQLQueries.ADD_ADMIN_CRED , values);
            
    }
    public static boolean signIn(AdminCred user) throws SQLException{
    	Object[] values = {user.getUserName(),user.getPassword()};
    	ResultSet rs = ConnectionDB.executeQuery(SQLQueries.ADMIN_SIGNIN , values);
    		if(rs.next()){
    		Admin.adminId=rs.getInt(1);
    		 return true;}
    		else return false ;
   }
}
