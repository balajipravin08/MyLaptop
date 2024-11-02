import View.*;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Main {
	private static final BookingHelper bh =  BookingHelper.getInstance();
	private static final ThretreHelper th =  ThretreHelper.getInstance();
	private static final MovieHelper mh =  MovieHelper.getInstance();
	private static final ShowTimeHelper sth =  ShowTimeHelper.getInstance();
	private static final UserHelper uh =  UserHelper.getInstance();
	private static final AdminHelper ah =  AdminHelper.getInstance();
	
	private static Scanner sc = MyScanner.getScannerInstance();
	
	public static void adminMenu () throws SQLException{
		while(true){
			System.out.println ("1.AddThretre\n2.AddMovie\n3.UpdateMovieToThretre\n4.DeleteMovie\n5.DeleteThretre\n6.AddShowTime\n7.DisplayUsers\n8.MainMenu");
			int num = sc.nextInt();
			switch(num){
				case(1) : sc.nextLine();
					th.addRecords();
					break;
				case(2) :sc.nextLine();
					mh.addRecords();
					break;
				case(3):sc.nextLine();
					th.updateRecords();
					break;
                    		case(4) :sc.nextLine();
					mh.deleteRecords();
					break;
				case(5):sc.nextLine();
					th.deleteRecords();
					break;
				case(6):sc.nextLine();
					sth.addRecords();
					break;
				case(7):
					for(Object u : uh.getRecords()){System.out.println(u);}
					break;
				default : sc.nextLine();
					return;
			}
		}
	}
	public static void userMenu() throws SQLException {
	    	while(true){
            		System.out.println ("1.DisplayThretreWithMovie\n2.DisplayUserInfo\n3.update\n4.delete\n5.AddBookings\n6.DisplayBookings\n7.Cancel Ticket\n8.MainMenu");
            		int num = sc.nextInt();	
                			switch(num){
                    			case(1):
                       				 for(Map<String , Object > movie : uh.getThretreWithLocation()){
                    	 				Set s1 = movie.entrySet();
							Iterator itr = s1.iterator();
							System.out.print("---------------------------------------------\n");
								while(itr.hasNext()){
									Map.Entry entry = (Map.Entry) itr.next();
									System.out.print(String.format("|%-20s : %-20s|\n", entry.getKey(), entry.getValue()));
								}
								System.out.print("---------------------------------------------\n");
                    	 			}
                    			 	break;
                    			case(2):
                        				for(Object u : uh.getInfo()){System.out.println(u);}
                        				break;
                    			case(3):sc.nextLine();
                        				uh.updateRecords();
                       				break;
                    			case(4):sc.nextLine();
                    	 			uh.deleteRecords();
                        				break;
                    			case(5):sc.nextLine();
                    					bh.addRecords();
                    				break;
                    			case(6):
                        				for(Map<String , Object > movie : bh.getRecords()){
                    	 				Set s1 = movie.entrySet();
							Iterator itr = s1.iterator();
							System.out.print("---------------------------------------------\n");
								while(itr.hasNext()){
									Map.Entry entry = (Map.Entry) itr.next();
									System.out.print(String.format("|%-20s : %-20s|\n", entry.getKey(), entry.getValue()));
								}
								System.out.print("---------------------------------------------\n");
                    	 			}
                    	 			break;
                    	 		case(7):sc.nextLine();
                        				bh.deleteRecords();
                       				break;
                    			default :sc.nextLine();
                        				return;	
            			}           
    		}
	}
	
	public static void superAdminMenu() throws SQLException{
		while(true){
			System.out.println ("1.AddAdmin\n2.DeleteAdmin\n3.DisplayAdmins\n4.MainMenu");
			int num = sc.nextInt();
			switch(num){
				case(1) : sc.nextLine();
					ah.addRecords();
					break;
                    		case(2) :sc.nextLine();
					ah.deleteRecords();
					break;
				case(3):
					for(Object o : ah.getRecords()){System.out.println(o);}
                    			break;
				default : sc.nextLine();
					return;
			}
		}
	}
	
    	public static void main (String [] args ) throws SQLException {
            	while(true){
            		System.out.println ("1.SignUp\n2.SignIn\n3.AdminLogin\n4.SuperAdminLogin\n5.Exit");
            	 	int num = sc.nextInt();	
                			switch(num){
                    			case(1):sc.nextLine();
                        				uh.addRecords();
                        				break;
                   				case(2):sc.nextLine();
                        				if(uh.signIn()){
                        					System.out.println("***** Welcome *****");
                        					userMenu();
                        				}else {System.out.println("***** Incorrect Data *****");}
                       				break;
                    			case(3):sc.nextLine();
                        				if(ah.adminLogin()){
                        					System.out.println("***** Welcome *****");
                        					adminMenu();
                        				}else {System.out.println("***** Incorrect Data *****");}
                        				break;
                        			case(4):sc.nextLine();
                        				if(ah.superAdminLogin()){
                        					System.out.println("***** Welcome *****");
                        					superAdminMenu();
                        				}else {System.out.println("***** Incorrect Data *****");}
                        				break;
                    			default : System.out.println("***** THANK YOU *****");
                        				System.exit(0);
                        				break;	
            			}           
    		}
    }	
}
