import java.util.Scanner;
class P2
{
	static void sumOfArray(int[] num)
	{
		int sum=0;
		for (int i=0;i<num.length;i++)
		{
			sum =sum + num[i];
		}
		System.out.print(sum);
	}	
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		sumOfArray(a); 
	}
}
