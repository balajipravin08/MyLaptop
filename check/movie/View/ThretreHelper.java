package View;

import Controller.ThretreDB;
import Model.Thretre;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ThretreHelper implements Records {

	private static final MovieHelper mh =  MovieHelper.getInstance();
	private static final Scanner sc = MyScanner.getScannerInstance();
	private static ThretreHelper thretreHelper = null;
	
	public static ThretreHelper getInstance(){
		if(thretreHelper == null){thretreHelper = new ThretreHelper();}
		return thretreHelper;
	}
	private ThretreHelper(){}
	    public  void addRecords() throws SQLException{
	    	sc.nextLine();	
    		System.out.println("Enter a Thretre name  : ");
    		String name = sc.nextLine();
    		System.out.println("Enter a Location  : ");
    		String location = sc.next();
    		System.out.println("Enter a AC(true) or NON  AC(false)  : ");
    		boolean ac = sc.nextBoolean();
    		System.out.println("Enter a Capacity  : ");
    		int capacity = sc.nextInt();
    		sc.nextLine();
    		if(ThretreDB.addThretre(new Thretre(name,location,ac,capacity)) > 0){
    			System.out.println("Thretre Added Sucessfully");
    		}
    		else{
    			System.out.println("Already Thretre Added");
    		}
    	}
	
	public  void updateRecords() throws SQLException{
		print(getRecords());
    		System.out.println("Enter a Thretre ID  : ");
    		int tid = sc.nextInt();
    		print(mh.getRecords());
    		System.out.println("Enter a movie ID : ");
    		int id = sc.nextInt();
    		sc.nextLine();
    		if(ThretreDB.updateMovieToThretre(id,tid) > 0){System.out.println("Updated Sucessfully");}
    		else{System.out.println("Not Updated");}
    	}
     public  void deleteRecords() throws SQLException{
     	print(getRecords());
    	System.out.println("Enter a Thretre ID you Want To Delete : ");
    	int id = sc.nextInt();
    	sc.nextLine();
    	if(ThretreDB.deleteThretre(id)>0){System.out.println("Thretre Deleted ");}
    	else{System.out.println("Invalid Thretre id ");}
    }
	public  List<Map<String,Object>> getRecords() throws SQLException{return ThretreDB.displayThretre();}
}
