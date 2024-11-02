public class P1
{
	static void sprial(int a[][] ,int n)
	{
		int srow=0;
		int scol = 0;
		int erow=n-1;
		int m = a[0].length;
		int ecol = m-1; 
		
		while (srow<=erow&&scol<=ecol)
		{
			for (int i=srow;i<=erow;i++)
			{
				System.out.print(a[i][scol]+" ");
			}
			scol++;
			
			for (int i=scol;i<=ecol;i++)
			{
				System.out.print(a[erow][i]+" ");
			}
			erow--;
			
			for (int i=erow;i>=srow;i--)
			{
				System.out.print(a[i][ecol]+" ");
			}
			ecol--;
			
			for (int i=ecol;i>=scol;i--)
			{
				System.out.print(a[srow][i]+" ");
			}
			srow++;
			
			
		}
	}
	public static void main(String[] args)
	{
		int[][] a = { {1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int n = a.length;
		sprial(a,n);
	}
}
