import java.util.Scanner;
class P9
{
	static boolean endsWith(String s1,String t)
	{
		int count=0;
		for (int i=s1.length()-t.length();i<s1.length();i++)
		{
			if (s1.charAt(i)==t.charAt(count))
			count++;
		}
		if (t.length()==count)
		return true;
		else
		return false;	
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s1 = sc.nextLine();
		System.out.print("Enter a String : ");
		String t = sc.nextLine();
		
		System.out.print(endsWith(s1,t));
	}
}
