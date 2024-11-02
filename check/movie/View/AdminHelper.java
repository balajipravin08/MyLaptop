package View;

import Controller.AdminCredDB;
import Controller.AdminDB;
import Model.Admin;
import Model.AdminCred;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class AdminHelper extends ValidateCheck {
	private static final int id = 1;
	private static final String userName = "balaji_12";
	private static final String password = "balaji@123";
	
	private static AdminHelper adminHelper = null;
	public static AdminHelper getInstance(){
		if(adminHelper == null){
			adminHelper = new AdminHelper();
		}
		return adminHelper;
	}
	private AdminHelper(){}
	
    
	private static final Scanner sc = MyScanner.getScannerInstance();
    
    public boolean superAdminLogin(){
        System.out.println("Enter a username : ");
        String userName = sc.nextLine();
        String password = getValidatedPassword("Enter a password : ");
        return this.userName.equals(userName) && this.password.equals(password) ;
    }
    
    public  boolean adminLogin() throws SQLException{
        System.out.println("Enter a username : ");
        String userName = sc.nextLine();
	String password = getValidatedPassword("Enter a password : ");
        return AdminCredDB.signIn(new AdminCred(userName,password));
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
        	AdminDB.add(new Admin(name,email,mobileNo));
        	AdminCredDB.add(new AdminCred(AdminDB.getId(email),userName,password));
    }
    public  void deleteRecords () throws SQLException{
        System.out.println("Enter a email to delete : ");
        String  n = sc.nextLine();
        if(AdminDB.delete(n)==0){System.out.println("***** Invalid details *****");}
    }
	public List getRecords() throws SQLException {
		return AdminDB.display();
	}
    
    public  void updateRecords() throws SQLException {
        while(true){
            System.out.println ("1.name \n2.email \n3.mobileNo\n4.userName\n5.password");
            int u = sc.nextInt();
            int row =0;
            sc.nextLine();
            switch(u){
                case(1):System.out.println("Enter a new name : ");
                    row=AdminDB.update(SQLQueries.UPDATE_ADMIN_NAME,sc.nextLine(),Admin.adminId);
                    break;
                case(2):System.out.println("Enter a new Email : ");
                    row=AdminDB.update(SQLQueries.UPDATE_ADMIN_EMAIL,sc.nextLine(),Admin.adminId);
                    break;
                case(3):System.out.println("Enter a new mobile No : ");
                    row=AdminDB.update(SQLQueries.UPDATE_ADMIN_MOBILE_NO,sc.nextLine(),Admin.adminId);
                    break;
                case(4):System.out.println("Enter a new user name : ");
                	row=AdminDB.update(SQLQueries.UPDATE_ADMIN_USERNAME,sc.nextLine(),Admin.adminId);
                    break;
                case(5):System.out.println("Enter a new password : ");
                	row=AdminDB.update(SQLQueries.UPDATE_ADMIN_PASSWORD,sc.nextLine(),Admin.adminId);
                    break;
                default:sc.nextLine();
                    return;
            }
            if(row==0) break;
        }
    }
}
