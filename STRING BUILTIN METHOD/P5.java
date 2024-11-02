import java.util.Scanner;
class P5
{
	static String trim(String str)
	{
		String temp="";
		int si=0,li=0;
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i)!=' ')
			{
			si=i;
			break;
			}	
		}
		for (int i=str.length()-1;i>=0;i--)
		{
			if (str.charAt(i)!=' ')
			{
			li=i;
			break;
			}
		}
		for (int i=si;i<=li;i++)
		{
			temp=temp+str.charAt(i);
		}
		
		return temp;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		System.out.print(trim(str));
	}
}
