import java.util.*;
import java.sql.SQLException;
public interface Records{
	void addRecords() throws SQLException;
	void updateRecords() throws SQLException;
	void deleteRecords() throws SQLException;
	List getRecords() throws SQLException;
	
	default void print(List<Map<String,Object>> list) throws SQLException{
		for(Map<String , Object > movie : list){
                    	Set s1 = movie.entrySet();
			Iterator itr = s1.iterator();
			System.out.print("---------------------------------------------\n");
				while(itr.hasNext()){
					Map.Entry entry = (Map.Entry) itr.next();
					System.out.print(String.format("|%-20s : %-20s|\n", entry.getKey(), entry.getValue()));
				}
			System.out.print("---------------------------------------------\n");
          	}
	}
	
}
