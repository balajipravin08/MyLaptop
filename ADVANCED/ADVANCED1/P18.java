import java.util.Scanner;
import java.util.Arrays;
class P18
{
	static void secondMin(int[] num)
	{	
		int min1,min2;
		if (num[0]<num[1])
		{
			min1=num[0];
			min2=num[1];
		}
		else
		{
			min2=num[0];
			min1=num[1];
		}
		
		for (int i=2;i<num.length;i++)
		{
			if (num[i]<min1)
			{	
				min2=min1;
				min1=num[i];
			}
			else if (num[i]<min2)
			{
				min2=num[i];
			}
		}
		
		System.out.println(" second maximum value is : "+min2);
		
	
	}	
	
	public static void main(String[] args)
	{
		int[] a = {1,4,3,2,5}; 
		secondMin(a);
		
	}
}
