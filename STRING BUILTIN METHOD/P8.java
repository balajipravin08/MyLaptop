import java.util.Scanner;
class P8
{
	static boolean startsWith(String s1,String t)
	{
		int count=0;
		for (int i=0;i<t.length();i++)
		{
			if (s1.charAt(i)==t.charAt(i))
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
		
		System.out.print(startsWith(s1,t));
	}
}
