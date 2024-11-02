package Model;

public class Booking {
	private int id ;
	private String customerName;
	private String thretreName;
	private String movieName;
	private String session ;
	private int noOfSeats;
	private String date ;
	
	public Booking(int id,String customerName,String thretreName,String movieName,String session,int noOfSeats,String date ){
		this.id=id;
		this.customerName=customerName;
		this.thretreName=thretreName;
		this.movieName=movieName;
		this.session=session;
		this.noOfSeats=noOfSeats;
		this.date=date;
	}
	public int getId(){return id;}
	public String getCustomerName(){return customerName;}
	public String getThretreName(){return thretreName;}
	public String getMovieName(){return movieName; }
	public String getSession(){return session; }
	public int getNoOfSeats(){return noOfSeats; }
	public String getDate(){return date; }
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("---------------------------------------------\n");
		sb.append(String.format("|%-20s : %-20s|\n", "booking Id ",  getId()));
		sb.append(String.format("|%-20s : %-20s|\n", "CustomerName",  getCustomerName()));
		sb.append(String.format("|%-20s : %-20s|\n", "ThretreName",  getThretreName()));
		sb.append(String.format("|%-20s : %-20s|\n", "MovieName",  getMovieName()));
		sb.append(String.format("|%-20s : %-20s|\n", "Session",  getSession()));
		sb.append(String.format("|%-20s : %-20s|\n", "NoOfSeats",  getNoOfSeats()));
		sb.append(String.format("|%-20s : %-20s|\n", "Date",  getDate()));
		sb.append("---------------------------------------------\n");
		return sb.toString();
	}
}
