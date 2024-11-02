import java.util.Scanner;
class P6
{
	static char[] toCharArray(String str)
	{
		char[] ch = new char[str.length()];
		
		for (int i=0;i<ch.length;i++)
		{
			ch[i]=str.charAt(i);
		}
		
		return ch;
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		
		System.out.print(toCharArray(str));
	}
}
