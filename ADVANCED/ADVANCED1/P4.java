import java.util.Scanner;
class P4
{
	static void avgOfArray(int[] num)
	{
		int sum=0;
		for (int i=0;i<num.length;i++)
		{
			sum =sum + num[i];
		}
		float avg = sum/num.length;
		System.out.print(avg);
	}	
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		avgOfArray(a); 
	}
}
