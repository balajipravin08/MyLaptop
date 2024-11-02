import java.util.Scanner;
import java.util.Arrays;
class P24
{
	static void missingArray(int[] a)
	{
		int temp;
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}	
		int k =a[0];
		for (int i=1;i<a.length;i++)
		{
			if (++k !=a[i])
			System.out.println("The missing number is : "+k);
			if (k<a[i])
			i--;
		}
	}	
	
	public static void main(String[] args)
	{
		int[] a = {2,5};
		missingArray(a);	
	}
}
