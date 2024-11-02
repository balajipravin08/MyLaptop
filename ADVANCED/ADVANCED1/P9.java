import java.util.Scanner;
import java.util.Arrays;
class P9
{
	static void copyAnArray(int[] num,int key,int n)
	{	
	int a =0;
		for (int i=0;i<num.length;i++)
		{
			if (i==n)
			{
				a=1;
				num[i]=key;
				System.out.print(Arrays.toString(num));
			}	
		}
		if (a==0)
		System.out.print(-1);
	}	
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		int key = 50;
		int position = 0;
		copyAnArray(a,key,position); 
	}
}
