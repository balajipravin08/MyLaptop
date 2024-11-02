import java.util.Scanner;
import java.util.Arrays;
class P22
{
	static void pairSum(int[] num,int len,int number)
	{	
		for (int i=0;i<len;i++)	
		{
			for (int j=i+1;j<len;j++)
			{
				if (num[i]+num[j]==number)
				{
					System.out.println("the sum of "+num[i]+" and "+num[j]+" is equal to "+number);
				}
			}
		}
		
		
	
	}
	
	public static void main(String[] args)
	{
		int[] a = {9,5,3,4,4}; 
		int len = a.length;
		int number = 8;
		pairSum(a,len,number);
		
	}
}
