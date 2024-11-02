import java.util.Scanner;

public class P5
{
	static void sort(char a[])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static void main(String []args)
	{
		String Word1, Word2;
		boolean check = true;
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String1: ");
		Word1 = str.next();
		System.out.print("Enter the String2: ");
		Word2 = str.next();
		
		char[] ch1 = new char[Word1.length()];
		char[] ch2 = new char[Word2.length()];
		
		for(int i=0;i<ch1.length;i++)
		{
		ch1[i]=Word1.charAt(i);
		}
		for(int i=0;i<ch2.length;i++)
		{
		ch2[i]=Word2.charAt(i);
		}
		sort(ch1);
		sort(ch2);
		
		if(ch1.length!=ch2.length)
		{
			check = false;
		}else{		
		
		
		for(int i=0; i<ch1.length; i++)
		{
			if(ch1[i]!=ch2[i])
			{
				check = false;
			}
		}
		
		}
		if(check)
		{
			System.out.println("The Given Strings are Anagrams");
		}
		else
		{
			System.out.println("The Given Strings are not Anagrams");
		}	
	}
}
