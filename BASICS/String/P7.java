import java.util.Scanner;

public class P7
	{
	static void capFirst(String word,int len)
	{
		String s="";
		for (int i=0;i<len;i++)
		{
		if(i==0)
		{
		if(word.charAt(i)>='a'&& word.charAt(i)<='z')
		s=s+(char)(word.charAt(i)-32);
		else
		s=s+(char)(word.charAt(i));
		}
		
		if (i!=0 && word.charAt(i-1)==' ')
		{
		if(word.charAt(i)>='a' && word.charAt(i)<='z')
		s=s+(char)(word.charAt(i)-32);
		else
		s=s+(char)(word.charAt(i));
		}
		else if (i!=0)
		{
		s=s+(char)(word.charAt(i));
		}
		}
		
		System.out.print(s);
	
	}
	public static void main(String []args)
	{
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String : ");	
		String word = str.nextLine();
		int len= word.length();
		capFirst(word,len);
		
	}
}
