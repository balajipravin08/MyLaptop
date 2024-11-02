package Controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class ShowTimeDB {
	public static int addShowTime(int tid,int mid,int sid) throws SQLException{
		Object[] values = {tid,mid,sid};
		return ConnectionDB.executeUpdate(SQLQueries.ADD_SHOW_TIME , values);
	}
	public static List<Map<String,Object>>  displayShows()throws SQLException{
		Object[] values={};
        		return ConnectionDB.executeQuerys(SQLQueries.DISPLAY_SHOWS , values);
	}
	
}
