import java.util.Scanner;
class P7
{
	static boolean startsWith(String s1,String s2)
	{
		for (int i=0;i<s1.length();i++)
		{
			if (s1.charAt(i)!=s2.charAt(i))
			return false;
		}
		return true;	
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s1 = sc.nextLine();
		System.out.print("Enter a String : ");
		String s2 = sc.nextLine();
		
		System.out.print(equals(s1,s2));
	}
}
