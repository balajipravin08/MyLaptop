package View;

import Controller.BookingDB;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.Map;

public class BookingHelper implements Records {

	private static final UserHelper uh =  UserHelper.getInstance();
	private static final ThretreHelper th =  ThretreHelper.getInstance();
	private static final MovieHelper mh =  MovieHelper.getInstance();
	private static final Scanner sc = MyScanner.getScannerInstance();
	private static BookingHelper bookingHelper = null;
	
	public static BookingHelper getInstance(){
		if(bookingHelper == null){
			bookingHelper = new BookingHelper();
		}
		return bookingHelper;
	}
	private BookingHelper(){}
	
	public  void addRecords() throws SQLException{
		print(uh.getThretreWithLocation());
		System.out.println("Enter a Thretre Id : ");
		int tid =sc.nextInt();
		int mid = MovieDB.getMovieId(tid);
		System.out.println("1 - MORNING(10:30 AM)\n2 - AFTERNOON(2:30 PM)\n3 - EVENING(6:30 PM)\n4 - NIGHT(10:30 PM)");
   		System.out.println("Enter a Session ID  : ");
    		int sid = sc.nextInt();
    		
		int thretreCapacity = ThretreDB.getThretreCapacity(tid);
   	 	int bookedCapacity = BookingDB.getBookingCapacity(sid,tid);
   	 	int availableCapacity = thretreCapacity-bookedCapacity;
   	 	boolean check = true;
   	 	while(check){
   	 	
			System.out.println( "***** Available Seats are ***** "+availableCapacity);
			System.out.println("Enter a NUM Of Seats  : ");
   	 		int nos = sc.nextInt();
   	 		sc.nextLine();
   	 			if(availableCapacity>=nos){
   	 				BookingDB.addBookings(User.userId,tid,mid,sid,nos);
   	 				System.out.println("***** Booked Sucessfull *****");
   	 				check = false;
   	 			}
   	 			else {
   	 				System.out.println("***** Not Available ...... Available Seats are *****"+availableCapacity);
   	 			} 
   	 	}
	}
   	 public void updateRecords() throws SQLException{}
   	 public void deleteRecords() throws SQLException{ 
   	 	print(getTodaysRecords());
   	 	System.out.println("Enter a booking id : ");
   	 	int id = sc.nextInt();
   	 	sc.nextLine();
   	 	if(BookingDB.cancelTicket(id) > 0){System.out.println("***** TICKET CANCELED SUCESSFULL *****");}
   	 	else{System.out.println("***** TICKET CANCELED UNSUCESSFULL *****");}
   	 }
   	 public List<Map<String , Object >> getTodaysRecords() throws SQLException{return BookingDB.displayTodaysBookings();}
   	 public List<Map<String , Object >> getRecords() throws SQLException{return BookingDB.displayBookings();}
   	 
}
