package Model;

public class AdminCred extends UserCred {

	public AdminCred(int id , String userName , String password){
		super(id,userName,password);
	}
	public AdminCred( String userName , String password){
		super(userName,password);
	}
}
