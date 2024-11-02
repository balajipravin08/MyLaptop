import java.util.Scanner;
class P6 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a meter : ");
		float meter = sc.nextInt();
		System.out.print(" Enter a hour : ");
		float hour = sc.nextInt();
		System.out.print(" Enter a minute : ");
		float minute = sc.nextInt();
		System.out.print(" Enter a second : ");
		float s = sc.nextInt();
		//meter to km
		float mkm = meter/1000;
		//meter to miles
		float mTm = meter*0.000621371f;
		// minute to hour
		float mh = minute/60;
		// second to hour 
		float sh = s/3600; 
		//hour to second
		float hs = hour*3600;
		//minute to second
		float ms = minute*60;
		// time in second
		float ts = hs+ms+s;
		//time in hour
		float th = hour+mh+sh;
		
		
		float kmPh = mkm/th;
		float mPs = meter/ts;
		float mPh = mTm/th;
		System.out.println("your speed in meter per second is : "+ mPs);
		System.out.println("your speed in kilometer per hour is : "+ kmPh);
		System.out.println("your speed in miles per hour is : "+ mPh);
		
		 
		
		
	}
}
