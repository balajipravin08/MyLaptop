package Controller;

import Model.Thretre;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class ThretreDB{
	private ThretreDB(){}
	
	public static int addThretre(Thretre obj) throws SQLException{
		Object[] values = {obj.getThretreName(),obj.getLocation(),obj.isAc(),obj.getCapacity()};
		return ConnectionDB.executeUpdate(SQLQueries.ADD_THRETRE , values);
	}
	public static int updateMovieToThretre(int id ,int tid) throws SQLException{
		Object[] values = {id,tid};
		return ConnectionDB.executeUpdate(SQLQueries.UPDATE_MOVIE_ID , values);
	}
	public static int deleteThretre(int id) throws SQLException{
		Object[] values = {id};
		return ConnectionDB.executeUpdate(SQLQueries.DELETE_THRETRE , values);
	}
	public static int getThretreCapacity(int id) throws SQLException{
		Object[] values = {id};
		ResultSet rs = ConnectionDB.executeQuery(SQLQueries.GET_THRETRE_CAPACITY , values);
		if(rs.next())
		return rs.getInt(1);
		else return 0;
	}
	public static List <Map<String,Object>> displayThretreWithMovie(String location)throws SQLException{
		Object[] values={location};
		return ConnectionDB.executeQuerys(SQLQueries.DISPLAY_THRETRE_WITH_MOVIE , values);
	}
	public static List<Map<String,Object>> displayThretre() throws SQLException{
		Object[] values = {};
        		return ConnectionDB.executeQuerys(SQLQueries.DISPLAY_THRETRE , values);
	}
}
