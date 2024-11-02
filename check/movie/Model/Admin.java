package Model;

public class Admin extends User {
	
	public static int adminId ;

	public Admin(int id , String name , String email ,long mobileNo){
		super(id,name,email,mobileNo);
	}
	public Admin(String name , String email ,long mobileNo){
		super(name,email,mobileNo);
	}
}
