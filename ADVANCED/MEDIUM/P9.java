import java.util.Scanner;
class P9
{
	static void leapOrNot(int y)
	{
		int leap = 0;
		if ((y%4==0&&y%100!=0)||y%400==0)
		leap = 1;
		else
		leap = 0;
		
		if (leap ==1)
		System.out.print(y+" is a leap year");
		else
		System.out.print(y+" is a not leap year");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year = sc.nextInt();
		leapOrNot(year);
		
		
	}
}
