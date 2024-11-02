import java.util.Scanner;
class P31
{
	static void checkArray(int[] a)
	{	
		
		int check = 30;
		int sum = 0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>9 && a[i]<100)
			{
				sum = sum+a[i];
			}
		}
		
		if (check==sum)
		{
			System.out.print("True");
		}
		else
		{
			System.out.print("False");
		}
		
	}	
	
	public static void main(String[] args)
	{
		int[] a = {11,20,4,5,16}; 
		checkArray(a);
		
		
	}
}
