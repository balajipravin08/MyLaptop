import java.util.Scanner;
import java.util.Arrays;
class P23
{
	static void equalityArray(int[] a,int[] b)
	{	
		boolean check = true;
		
		if (a.length!=b.length)
		{
			check = false;
		}else
		{
		for (int i=0;i<a.length;i++)
		{
			if (a[i]!=b[i])
			{
			check = false;
			break;
			}
		}
		
		}
		
		if (check)
		{
			System.out.print("two arrays are equal");
		}
		else
		{
			System.out.print("two arrays are not equal");
		}
	}	
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6}; 
		int[] b = {1,2,3,4,5};
		equalityArray(a,b);
		
		
	}
}
