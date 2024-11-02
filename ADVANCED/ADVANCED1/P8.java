import java.util.Scanner;
import java.util.Arrays;
class P8
{
	static void copyAnArray(int[] num)
	{	
		int[] a = new int[num.length];
		
		for (int i=0;i<num.length;i++)
		{
			a[i]=num[i];
		}
		System.out.print(Arrays.toString(a));
	}	
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		copyAnArray(a); 
	}
}
