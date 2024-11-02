import java.util.Scanner;
class P30
{
	static void checkArray(int[] a)
	{	
		boolean check = false;
		
		
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==0 || a[i]==-1)
			{
			check = true;
			break;
			}
		}
		
		if (check)
		{
			System.out.print("Array contains 0 and -1 ");
		}
		else
		{
			System.out.print("Array not contains 0 and -1 ");
	}	
	}
	
	public static void main(String[] args)
	{
		int[] a = {-1,2,3,4,5,0}; 
		checkArray(a);
		
		
	}
}
