package Model;

public class User{
	private int id ;
	private String name;
	private String email;
	private long mobileNo;
	
	public static int userId ;
	
	public User(int id , String name , String email ,long mobileNo){
		this.id = id;
		this.name=name;
		this.email=email;
		this.mobileNo=mobileNo;
	}
	public User(String name , String email ,long mobileNo){
		this.name=name;
		this.email=email;
		this.mobileNo=mobileNo;
	}
	
	
	public int getId(){return id;}
	public String getName(){return name;}
	public String getEmail(){return email;}	
	public long getMobileNo() {return mobileNo;}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("----------------------------------------\n");
		sb.append(String.format("|%-15s : %-20s|\n", "Id",  getId()));
		sb.append(String.format("|%-15s : %-20s|\n", "Name",  getName()));
		sb.append(String.format("|%-15s : %-20s|\n", "Email",  getEmail()));
		sb.append(String.format("|%-15s : %-20s|\n", "Mobile no",  getMobileNo()));
		sb.append("----------------------------------------\n");
		return sb.toString();
	}
}
