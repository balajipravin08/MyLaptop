import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {

        
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/NewJdbc","postgres","4400");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Statement stmt = null;
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
