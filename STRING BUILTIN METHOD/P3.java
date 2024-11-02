import java.util.Scanner;
class P3
{
	static int indexOf(String str,char key)
	{
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if (ch==key)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.next();
		System.out.print("Enter a key character : ");
		char key = sc.next().charAt(0);
		
		System.out.print(indexOf(str,key));
	}
}
