import java.util.Scanner;
import java.util.Arrays;
class P10
{
	static void maxAndmin(int[] num)
	{	
		int max = num[0];
		int min = num[0];
		
		for (int i=1;i<num.length;i++)
		{
			if (num[i]>max)
			{
				max=num[i];
			}
			if (num[i]<min)
			{
				min=num[i];
			}
		}
		
		System.out.println("maximum value is : "+max);
		System.out.println("minimum value is : "+min);
	
	}	
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5}; 
		maxAndmin(a);
		
	}
}
