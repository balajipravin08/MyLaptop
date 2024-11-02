import java.util.Scanner;
class P5
{
	static void findArray(int[] num,int find)
	{
		boolean check = false;
		for (int i=0;i<num.length;i++)
		{
			if (find==num[i])
			{
				check=true;
				break;
			}
		}
		System.out.print(check);
	}	
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		int find = 0;
		findArray(a,find); 
	}
}
