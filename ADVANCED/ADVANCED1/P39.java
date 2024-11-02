import java.util.Scanner;
class P39
{
	public static void leader(int a[], int n)
	{
		for(int i=0; i<n-1;i++)
		{
			if(a[i]>a[i+1])
			{			
				System.out.print(a[i]+" ");	
			}
		}
		System.out.print(a[n-1]+" ");
	}
		
	public static void main(String[] args)
	{
		int[] a = {1,2,5,1,4,2}; 
		int n = a.length;
		leader(a,n);
		
		
	}
}
