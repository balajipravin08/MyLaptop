package View;

import Controller.ShowTimeDB;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.List;
import java.util.Map;

public class ShowTimeHelper implements Records {
	private static final ThretreHelper th =  ThretreHelper.getInstance();
	private static final MovieHelper mh =  MovieHelper.getInstance();
	private static final Scanner sc = MyScanner.getScannerInstance();
	private static ShowTimeHelper showTimeHelper = null;
	
	public static ShowTimeHelper getInstance(){
		if(showTimeHelper == null){showTimeHelper = new ShowTimeHelper();}
		return showTimeHelper;
	}
	private ShowTimeHelper(){}
	
	public  void addRecords() throws SQLException{
		print(th.getRecords());
   	 	System.out.println("Enter a Thretre ID  : ");
   	 	int tid = sc.nextInt();
   	 	print(mh.getRecords());
   	 	System.out.println("Enter a Movie ID  : ");
   	 	int mid = sc.nextInt();
   	 	System.out.println("1 - MORNING\n2 - AFTERNOON\n3 - EVENING\n4 - NIGHT");
   	 	System.out.println("Enter a Session ID  : ");
   	 	int sid = sc.nextInt();
   	 	sc.nextLine();
   	 	if(ShowTimeDB.addShowTime(tid,mid,sid) > 0){System.out.println("Show Time Added Sucessfully");}
   	 	else{System.out.println("Show Time Not Added");}
   	 }
   	  public  void updateRecords(){ System.out.println("Not Available");}
   	 public  void deleteRecords(){ System.out.println("Not Available");}
   	 public  List<Map<String,Object>> getRecords() throws SQLException{
   	 	return ShowTimeDB.displayShows();
   	 }
}
