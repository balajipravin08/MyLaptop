package Controller;

import Model.User;
import Model.UserCred;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserCredDB{
	public static void add(UserCred user) throws SQLException {
        		Object[] values = {user.getId(),user.getUserName(),user.getPassword()};
        		ConnectionDB.executeUpdate(SQLQueries.ADD_USER_CRED , values);
            
    }
    public static boolean signIn(UserCred user) throws SQLException{
    	Object[] values = {user.getUserName(),user.getPassword()};
    	ResultSet rs = ConnectionDB.executeQuery(SQLQueries.USER_SIGNIN , values);
    		if(rs.next()){
    		User.userId=rs.getInt(1);
    		 return true;}
    		else return false ;
   }
}
