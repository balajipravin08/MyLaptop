import java.util.Scanner;
import java.util.Arrays;
class P14
{
	static void duplicates(String[] str,String[] str1,int len)
	{	
		for (int i=0;i<len;i++)	
		{
			for (int j=0;j<str1.length;j++)
			{
				if (str[i].equals(str1[j]))
				
				System.out.print(str[i]+" ");
			}
		}
		
	
	}	
	
	public static void main(String[] args)
	{
		String[] str = {"a","j","b","A"}; 
		String[] str1 = {"a","j","A","a"};	
		int len = str.length;
		duplicates(str,str1,len);
		
	}
}
