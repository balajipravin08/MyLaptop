import java.util.Scanner;
import java.util.Arrays;
class P7
{
	static void sprial(int[][] a)
	{
		int len = a.length;
		int srow = 0;int erow = len-1;
		int scol = 0;int ecol = len-1;
		
		while(srow<erow&&scol<ecol)
		{
			for(int i = scol;i<=ecol;i++)
			{
				System.out.print(a[srow][i]+" ");
			}
			srow++;
			
			for(int i = srow;i<=erow;i++)
			{
				System.out.print(a[i][ecol]+" ");
			}
			ecol--;
			
			for(int i = ecol;i>=scol;i--)
			{
				System.out.print(a[erow][i]+" ");
			}
			erow--;
			
			for(int i = erow;i>=srow;i--)
			{
				System.out.print(a[i][scol]+" ");
			}
			scol++;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[][] a = {{1,2,3,4},
			     {12,13,14,5},
			     {11,16,15,6},
			     {10,9,8,7}};
			     
			     sprial(a);		
	}
}
