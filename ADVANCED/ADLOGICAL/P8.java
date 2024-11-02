import java.util.Scanner;
import java.util.Arrays;
class P8
{
	static void three(int[] a)
	{
		int len = a.length;
		int product1 = a[len-1]*a[len-2]*a[len-3];
		int product2 = a[0]*a[1]*a[len-1];
		
		if (product1>product2)
		{
			System.out.print(a[len-1]+","+a[len-2]+","+a[len-3]+" The product of these three number is : "+product1);
		}
		else
		{
			System.out.print(a[0]+","+a[1]+","+a[len-1]+" The product of these three number is : "+product2);
		}
		
		
			
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] a = {-199,-799,444,5,88,34};
		if (a.length>=3)
		{
			Arrays.sort(a);
			three(a);
		}
		else
		{
			System.out.print("the given array length is small");
		}
		
		
		
		
		
		
	}
}
