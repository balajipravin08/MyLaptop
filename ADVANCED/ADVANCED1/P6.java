import java.util.Scanner;
class P6
{
	static void indexOfArray(int[] num,int find)
	{
		int a=0;
		
		for (int i=0;i<num.length;i++)
		{
			if (find==num[i])
			{
				a=1;
				System.out.print(i);
				break;
			}
		}
		if (a==0)
		System.out.print(-1);
	}	
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		int find = 3;
		indexOfArray(a,find); 
	}
}
