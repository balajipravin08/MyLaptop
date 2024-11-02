import java.util.Scanner;
class P8
{
	static void vowOrCon(String s)
	{
		if (s.equalsIgnoreCase("a")||s.equalsIgnoreCase("e")||s.equalsIgnoreCase("i")||s.equalsIgnoreCase("o")||s.equalsIgnoreCase("u"))
		System.out.print("Vowels");
		else
		System.out.print("Consonant");
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a letter : ");
		String s = sc.next();
		char c = (char)s.charAt(0);
		if (s.length()==1)
		{
			if (c>='a'&&c<='z' ||c>='A'&&c<='Z')
			{
				vowOrCon(s);
			}
		}
		
		else
		System.out.print("invalid");
		
	}
}
