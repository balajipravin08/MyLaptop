import java.util.Scanner;
import java.util.Arrays;
class P13
{
	static void duplicates(String[] str,int len)
	{	
		for (int i=0;i<len;i++)	
		{
			for (int j=i+1;j<len;j++)
			{
				if (str[i].equalsIgnoreCase(str[j]))
				System.out.print(str[i]+" ");
			}
		}
		
	
	}	
	
	public static void main(String[] args)
	{
		String[] str = {"a","j","b","a"}; 
		int len = str.length;
		duplicates(str,len);
		
	}
}
