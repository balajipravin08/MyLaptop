import java.util.Scanner;
class P29
{
	static void averageOfArray(int[] num,int len)
	{	
		int max=0,min=0;
		
		float sum=0.0f,avg=0.0f;
		
		if (len<=1)
		{
			System.out.print("give array length 1 and avove");
		}
		else
		{
		
		if (num[0]<=num[1])
		{
		max=num[1];
		min=num[0];
		}
		else
		{
		max=num[0];
		min=num[1];
		}
		
		
		for (int i=2;i<len;i++)	
		{
			if (max<num[i])
			{
				max=num[i];
			}
			if (min>num[i])
			{
				min=num[i];
			}
		}	
		}
			for (int i=0;i<len;i++)
			{
				if (num[i]!=max && num[i]!=min)
				{
				sum = sum+num[i];
				}
			}
			avg=sum/(len-2);
			
			System.out.print("The average of array except max and min value is : "+avg);
	}
	
	public static void main(String[] args)
	{
		int[] a = {9,2,3,4,5,6}; 
		int len = a.length;
		averageOfArray(a,len);
		
	}
}
