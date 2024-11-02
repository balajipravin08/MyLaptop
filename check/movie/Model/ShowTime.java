package Model;

public class ShowTime {
	private int showId ;
	private String thretreName ;
	private String movieName ;
	private String session ;
	
	public ShowTime(int showId , String thretreName ,  String movieName , String session){
		this.showId=showId;
		this.thretreName=thretreName;
		this.movieName=movieName;
		this.session=session;
	}
	
	public int getShowId(){ return showId ; }
	public String getThretreName(){ return thretreName ; }
	public String getMovieName(){ return movieName ; }
	public String getSession(){ return session ; }

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("---------------------------------------------\n");
		sb.append(String.format("|%-20s : %-20s|\n", "Show Id ",  getShowId()));
		sb.append(String.format("|%-20s : %-20s|\n", "ThretreName",  getThretreName()));
		sb.append(String.format("|%-20s : %-20s|\n", "MovieName",  getMovieName()));
		sb.append(String.format("|%-20s : %-20s|\n", "Session",  getSession()));
		sb.append("---------------------------------------------\n");
		return sb.toString();
	}
}
