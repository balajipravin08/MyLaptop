import java.util.Scanner;
import java.util.Arrays;
class P37
{
	static void sumOfTwoNum(int[][] num,int len,int key)
	{	
		boolean check = true;
		for (int i=0;i<num.length;i++)	
		{
			if (check)
			{
				for(int j=0;j<num[0].length;j++)
				{
					System.out.print(num[i][j]+" ");
				}
			}
			else
			{
				for(int j=num[0].length-1;j>=0;j--)
				{
					System.out.print(num[i][j]+" ");
				}
			}
			System.out.println();
			check= !check;	
		}
	}	
	
	public static void main(String[] args)
	{
		int[][] a = {{1,2,3,4},
				{4,5,6,7},
				{7,8,9,10},
				{11,12,13,14}};
		int len = a.length;
		int key = 5;
		sumOfTwoNum(a,len,key);
		
	}
}
