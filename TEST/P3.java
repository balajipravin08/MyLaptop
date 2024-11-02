import java.util.Scanner;
import java.util.Arrays;
public class P3
{
	static void distinct(int[] a,int n)
	{
		
	}
	public static void main(String[] args)
	{
		String s = "HOW ARE YOU";
		char[] ch = new char[s.length()];
		ch = s.toCharArray();
		
		for (int i=0;i<ch.length;i++)
		{
			if (ch[i]=='O')
			ch[i]='A';
			else if (ch[i]=='A'||ch[i]=='E')
			ch[i]='O';
			if (ch[i]=='Y')
			ch[i]='W';
			else if (ch[i]=='W')
			ch[i]='Y';
		}
		
		System.out.print(Arrays.toString(ch));
		
		
	}
}
