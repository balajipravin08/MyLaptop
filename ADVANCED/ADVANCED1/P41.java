import java.util.Scanner;
class P41
{
	public static void majority(int a[], int n)
	{
		int min=0,min2=0,min3=0;
			
			for (int i=0;i<n;i++)
			{
				if (min>a[i])
				{
					min2=min;
					min = a[i];	
				}
				else if (min2>a[i])
				{
					min3=min2;
					min2=a[i];
				}
				else
				{
					min3=a[i];
				}
			}
			System.out.println(min+" ");
			System.out.println(min2+" ");
			System.out.println(min3+" ");
	}	
		
	public static void main(String[] args)
	{
		int[] a = {10,1,3,4,2}; 
		int n = a.length;
		majority(a,n);
		
		
	}
}
