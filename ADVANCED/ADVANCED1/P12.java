import java.util.Scanner;
import java.util.Arrays;
class P12
{
	static void duplicates(int[] num,int len)
	{	
		for (int i=0;i<len;i++)	
		{
			for (int j=i+1;j<len;j++)
			{
				if (num[i]==num[j]&&num[i]!=0)
				{
					num[j]=0;
					System.out.print(num[i]+" ");
				}
			}
		}
		
	
	}	
	
	public static void main(String[] args)
	{
		int[] a = {9,5,3,4,5,3,9}; 
		int len = a.length;
		duplicates(a,len);
		
	}
}
