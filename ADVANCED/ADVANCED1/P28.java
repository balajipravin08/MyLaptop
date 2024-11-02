import java.util.Scanner;
class P28
{
	static void diffBWMaxAndMin(int[] num,int len)
	{	
		int max=0,min=0;
		
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
			int diff = max-min;
			System.out.print("The difference b/w max value "+max+" and min value "+min+" is : "+diff);
	}
	
	public static void main(String[] args)
	{
		int[] a = {0,2,3,4,5}; 
		int len = a.length;
		diffBWMaxAndMin(a,len);
		
	}
}
