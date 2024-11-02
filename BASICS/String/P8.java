import java.util.Scanner;

public class P8
{
	public static void main(String []args)
	{
		
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the String : ");	
		String Word = str.nextLine();
		char ch[]=new char[Word.length()];
		
		for(int i=0;i<Word.length();i++){
		ch[i]=Word.charAt(i);
		
		}
		
		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					ch[i]='0';
					ch[j]='0';
				}
			}
		}
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]!='0')
			{
				System.out.println(ch[i]);
				break;
			}
		}
	}
}
