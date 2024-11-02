import java.util.Scanner;
import java.util.Arrays;
class P17
{
	static void secondMax(int[] num)
	{	
		int max1,max2;
		if (num[0]>num[1])
		{
			max1=num[0];
			max2=num[1];
		}
		else
		{
			max2=num[0];
			max1=num[1];
		}
		
		for (int i=2;i<num.length;i++)
		{
			if (num[i]>max1)
			{	
				max2=max1;
				max1=num[i];
			}
			else if (num[i]>max2)
			{
				max2=num[i];
			}
		}
		
		System.out.println(" second maximum value is : "+max2);
		
	
	}	
	
	public static void main(String[] args)
	{
		int[] a = {1,4,3,2,5}; 
		secondMax(a);
		
	}
}
