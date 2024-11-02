import java.util.Scanner;
class P2
{
	static String toLowerCase(String str)
	{
		String temp = "";
		
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if (ch>='A'&&ch<='Z')
			{
				temp = temp +(char)(ch+32);
			}
			else 
			{
				temp = temp + ch;
			}
		}
		return temp;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.next();
		
		System.out.print(toLowerCase(str));
	}
}
