import java.util.Scanner;
public class P2
{
	static int missingArray(int[] a,int n)
	{	
		int tsum=0;
		int asum =0;
		
		
			for(int i=0;i<n;i++)
			{
				tsum = tsum + i+1;
				asum = asum +a[i];
			}
		
			int sum = tsum-asum;
			return sum;
			
		
	}	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of an array : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter a value of index  ");
			a[i]=sc.nextInt();
		}
		System.out.print(missingArray(a,n));	
	}
}
