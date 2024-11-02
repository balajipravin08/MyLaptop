import java.util.Scanner;
import java.util.Arrays;
class P34
{
	static void sumOfTwoNum(int[] num,int len,int key)
	{	
		for (int i=0;i<len;i++)	
		{
			for (int j=i+1;j<len;j++)
			{
				if (num[i]+num[j]==key)
				{
					System.out.println("The sum of "+num[i]+" and "+num[j]+" is equal to : "+key);
				}
				
			}
		}
	}	
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5}; 
		int len = a.length;
		int key = 5;
		sumOfTwoNum(a,len,key);
		
	}
}
