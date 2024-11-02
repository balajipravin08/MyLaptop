package View;

import Controller.MovieDB;
import Model.Movie;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.List;
import java.util.Map;

public class MovieHelper implements Records {

	private static final ThretreHelper th =  ThretreHelper.getInstance();
	private static final Scanner sc = MyScanner.getScannerInstance();
	private static MovieHelper movieHelper = null;
	
	public static MovieHelper getInstance(){
		if(movieHelper == null){
			movieHelper = new MovieHelper();
		}
		return movieHelper;
	}
	private MovieHelper(){}

	public  void addRecords() throws SQLException{
    		System.out.println("Enter a Movie name  : ");
    		String name = sc.nextLine();
    		System.out.println("Enter a Movie Language  : ");
    		String language = sc.next(); 	
    		System.out.println("Enter a Movie Duration in Minutes  : ");
    		int duration = sc.nextInt();
    		sc.nextLine();
    		MovieDB.addMovie(new Movie(name,language,duration));
    	}
	public  void updateRecords() throws SQLException{
		print(th.getRecords());
    		System.out.println("Enter a Thretre ID  : ");
    		int tid = sc.nextInt();
    		print(getRecords());
    		System.out.println("Enter a movie ID : ");
    		int id = sc.nextInt();
    		sc.nextLine();
    		MovieDB.updateMovieToThretre(id,tid);
    	}
      	public void deleteRecords() throws SQLException{
      		print(getRecords());
    		System.out.println("Enter a Movie ID you Want To Delete : ");
    		int id = sc.nextInt();
    		sc.nextLine();
    		if(MovieDB.deleteMovie(id)>0){	System.out.println("Movie Deleted ");}
    		else{System.out.println("Movie is Running in thretre");}
     	 }
	public  List<Map<String,Object>> getRecords() throws SQLException{
		return MovieDB.displayMovie();
	}	
}
