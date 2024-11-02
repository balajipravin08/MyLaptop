package View;

import Controller.SQLQueries;
import Controller.ThretreDB;
import Controller.UserCredDB;
import Controller.UserDB;
import Model.User;
import Model.UserCred;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;

public class UserHelper extends ValidateCheck {
	
	private static UserHelper userHelper = null;
	public static UserHelper getInstance(){
		if(userHelper == null){
			userHelper = new UserHelper();
		}
		return userHelper;
	}
	private UserHelper(){}
	
    
	private static final Scanner sc = MyScanner.getScannerInstance();
    
    public  boolean signIn() throws SQLException{
        System.out.println("Enter a username : ");
        String userName = sc.nextLine();
        String password = getValidatedPassword("Enter a password : ");
        return UserCredDB.signIn(new UserCred(userName,password));
    }
    public  void addRecords() throws SQLException {
        System.out.println("Enter a name : ");
        String name = sc.nextLine();
        System.out.println("Enter a email : ");
        String email = sc.nextLine();
        	System.out.println("Enter a username : ");
        	String userName = sc.nextLine();
        	String password = getValidatedPassword("Enter a password : ");
        	long mobileNo = getValidatedMobileNumber("Enter a mobile no  : ");
        	UserDB.add(new User(name,email,mobileNo));
        	UserCredDB.add(new UserCred(UserDB.getId(email),userName,password));
        	
    }
    public  void deleteRecords () throws SQLException{
        System.out.println("Enter a email to delete : ");
        String  n = sc.nextLine();
        if(UserDB.delete(n)==0){
            System.out.println("***** Invalid details *****");
        }
    }
	public  List getRecords() throws SQLException {
		return UserDB.display();
	}
	public  List getInfo(){
		return UserDB.getInfo();
	}
	
	public List<Map<String,Object>> getThretreWithLocation() throws SQLException{
		List<Map<String,Object>> list = new ArrayList<>();
		boolean check = true;
		while(check){
		System.out.println("1 - Srivilliputhur\n2 - Rajapalayam\n3 - Sivakasi\n4 - Madurai");
		System.out.println("Enter a Location Id  : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num){
				case(1):list = ThretreDB.displayThretreWithMovie("SRIVILLIPUTHUR");
					check = false;
					break;
    				case(2):list = ThretreDB.displayThretreWithMovie("RAJAPALAYAM");
    					check = false;
					break;
    				case(3):list = ThretreDB.displayThretreWithMovie("SIVAKASI");
    					check = false;
					break;
    				case(4):list = ThretreDB.displayThretreWithMovie("MADURAI");
    					check = false;
					break;
    				default://sc.nextLine();
    					System.out.println("INVALID ID ");
    					break;
			}
			if(!check) return list;
		}
		return list;	
	}
	
	
    
    public  void updateRecords() throws SQLException {
        while(true){
            System.out.println ("1.name \n2.email \n3.mobileNo\n4.userName\n5.password");
            int u = sc.nextInt();
            int row =0;
            switch(u){
                case(1):sc.nextLine();
                	System.out.println("Enter a new name : ");
                    row=UserDB.update(SQLQueries.UPDATE_USER_NAME,sc.nextLine(),User.userId);
                    break;
                case(2):sc.nextLine();
                	System.out.println("Enter a new Email : ");
                    row=UserDB.update(SQLQueries.UPDATE_USER_EMAIL,sc.nextLine(),User.userId);
                    break;
                case(3):sc.nextLine();
                	System.out.println("Enter a new mobile No : ");
                    row=UserDB.update(SQLQueries.UPDATE_USER_MOBILE_NO,sc.nextLine(),User.userId);
                    break;
                case(4):sc.nextLine();
                	System.out.println("Enter a new user name : ");
                	row=UserDB.update(SQLQueries.UPDATE_USER_USERNAME,sc.nextLine(),User.userId);
                    break;
                case(5):sc.nextLine();
                	System.out.println("Enter a new password : ");
                	row=UserDB.update(SQLQueries.UPDATE_USER_PASSWORD,sc.nextLine(),User.userId);
                    break;
                default:sc.nextLine();
                    return;
            }
            if(row==0) break;
        }
    }
}
