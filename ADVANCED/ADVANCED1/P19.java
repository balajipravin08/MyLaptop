import java.util.Scanner;
import java.util.Arrays;
class P19
{
	static void sumMatrix(int[][] a,int[][] b,int n)
	{
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}
	}	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of an array : ");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		sumMatrix(a,b,n);		
	}
}
