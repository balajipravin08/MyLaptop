package Model;

public class Movie {
	private int id ;
	private String movieName;
	private String language;
	private int duration ; 
	
	
	private Movie(){}
	
	public Movie (int id , String movieName ,String language, int duration){
		this.id=id ;
		this.movieName= movieName;
		this.language=language;
		this.duration=duration ; 
	}
	public Movie (String movieName ,String language, int duration){
		this.movieName= movieName;
		this.language=language;
		this.duration=duration ; 
	}
	
	public int getMovieId(){ return id ; }
	public String getMovieName() {return movieName ; }
	public int getDuration(){return duration ; }
	public String getLanguage(){return language; }
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("---------------------------------------------\n");
		sb.append(String.format("|%-20s : %-20s|\n", "Movie Id",  getMovieId()));
		sb.append(String.format("|%-20s : %-20s|\n", "Movie Name",  getMovieName()));
		sb.append(String.format("|%-20s : %-20s|\n", "Movie Language",  getLanguage()));
		sb.append(String.format("|%-20s : %-20s|\n", "Movie Duration",  getDuration()));
		sb.append("---------------------------------------------\n");
		return sb.toString();
	}
}
