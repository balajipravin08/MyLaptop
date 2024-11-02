package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


public class BookingDB{
	private BookingDB(){}
	
	public static int addBookings(int cid , int tid , int mid , int sid , int noOfTickets) throws SQLException{
		Object[] values = {cid,tid,mid,sid,noOfTickets};
		return ConnectionDB.executeUpdate(SQLQueries.ADD_BOOKINGS , values);
	}
	
	public static int getBookingCapacity(int id,int tid) throws SQLException{
		Object[] values = {id,tid};
		ResultSet rs = ConnectionDB.executeQuery(SQLQueries.GET_BOOKING_SEATS , values);
		if(rs.next())return rs.getInt(1);
		else return 0;
	}
	public static int cancelTicket(int id) throws SQLException{//suisewnw
		Object[] values = {id};
		return ConnectionDB.executeUpdate(SQLQueries.CANCEL_TICKET , values);
	}
	public static List<Map<String , Object >> displayTodaysBookings() throws SQLException{
		int id = User.userId; 
		Object[] values = {id};
		return ConnectionDB.executeQuerys(SQLQueries.DISPLAY_TODAYS_BOOKINGS,values);
	}
	
	public static List<Map<String , Object >> displayBookings() throws SQLException{
		int id = User.userId; 
		Object[] values = {id};
		return ConnectionDB.executeQuerys(SQLQueries.DISPLAY_BOOKINGS,values);
	}
}
