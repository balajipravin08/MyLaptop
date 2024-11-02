import java.util.Scanner;
class P4{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a minutes : ");
		long minutes = sc.nextLong();
		
		long minutesPerYear = 24*60*365;
		
		int years = (int)(minutes/minutesPerYear);
		
		long remaniningMinutes = minutes - (minutesPerYear*years);
		
		int days =(int)(remaniningMinutes/1440);
		
		System.out.print(minutes + " minutes is equal to " + years +" years "+days+" days");
		
		
	}
}
