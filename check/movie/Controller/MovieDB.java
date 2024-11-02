package Controller;

import Model.Movie;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.sql.ResultSet;
public class MovieDB{
	public static int addMovie(Movie obj) throws SQLException{
		Object[] values = {obj.getMovieName(),obj.getLanguage(),obj.getDuration()};
		return ConnectionDB.executeUpdate(SQLQueries.ADD_MOVIE , values);
	}
	public static int getMovieId(int id) throws SQLException{
		Object[] values = {id};
		ResultSet rs = ConnectionDB.executeQuery(SQLQueries.GET_MOVIE_ID , values);
		if(rs.next()){
			return rs.getInt(1);
		}
		return 0;
	}
	public static int updateMovieToThretre(int id ,int tid) throws SQLException{
		Object[] values = {id,tid};
		return ConnectionDB.executeUpdate(SQLQueries.UPDATE_MOVIE_ID , values);
	}
	public static int deleteMovie(int id) throws SQLException{
		Object[] values = {id};
		return ConnectionDB.executeUpdate(SQLQueries.DELETE_MOVIE , values);
	}
	public static List<Map<String,Object>> displayMovie() throws SQLException{
		Object[] values = {};
        		return  ConnectionDB.executeQuerys(SQLQueries.DISPLAY_MOVIE , values);
	}
}
