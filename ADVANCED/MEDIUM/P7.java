import java.util.Scanner;
class P7
{
	static void daysInMonth(int year , int month,int leap)
	{
		switch (month)
		{
			case 1 :
			System.out.print("jan "+31+" year "+year);
			break;
			
			case 2 :
			if (leap==0)
			System.out.print("feb "+28);
			else
			System.out.print("feb "+29);
			break;
			
			case 3 :
			System.out.print("mar "+31);
			break;
			
			case 4 :
			System.out.print("apr "+30);
			break;
			
			case 5 :
			System.out.print("may "+31);
			break;
			
			case 6 :
			System.out.print("jun "+30);
			break;
			
			case 7 :
			System.out.print("jul "+31);
			break;
			
			case 8 :
			System.out.print("aug "+31);
			break; 
			
			case 9 :
			System.out.print("sep "+30);
			break;
			
			case 10 :
			System.out.print("oct "+31);
			break;
			
			case 11 :
			System.out.print("nov "+30);
			break;
			
			case 12 :
			System.out.print("dec "+31);
			break;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a month : ");
		int month =sc.nextInt();
		System.out.print("Enter a year : ");
		int y =sc.nextInt();
		int leap =0;
		if ((y%4==0&&y%100!=0)||y%400==0)
		leap = 1;
		else
		leap = 0;
		
		daysInMonth(y,month,leap);
		
		 
	}
}
