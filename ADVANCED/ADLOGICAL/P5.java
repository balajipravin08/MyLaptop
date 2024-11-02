import java.util.Scanner;
class P5
{
	static void findWays (int[][] a,int m,int n)
	{
		for (int i=0;i<m;i++)
		{
			a[i][0]=1;
		}
		for (int j=0;j<n;j++)
		{
			a[0][j]=1;
		}
		
		for (int i=1;i<m;i++)
		{
			for (int j=1;j<n;j++)
			{
				a[i][j]=a[i-1][j]+a[i][j-1];
			}
		}
		System.out.print(a[m-1][n-1]);	
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][]	a = new int[m][n];
		findWays(a,m,n);
			
	}
}
