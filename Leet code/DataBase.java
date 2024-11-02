import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DataBase{
	private DataBase(){}
	private static Connection con = null;
	private static final String url = "jdbc:postgresql://localhost:5432/h";
	private static final String user = "postgres";
	private static final String password = "zoho";
	
	public static Connection getConnection(){
		try{
			if(con==null){
				con = DriverManager.getConnection(url,user,password);
			}
		}catch(SQLException e){
			System.out.println("Connection Failed");
		}
		return con;
	}
	public static void close(){
		if (con!=null){
            try {
                con.close();
            } catch (SQLException e) {
				System.out.println("Connection closing failed");
            }
        }
	}
}
  
