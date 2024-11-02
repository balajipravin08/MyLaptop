import java.util.Scanner;
import java.util.Arrays;
class P25
{
	static void threeSortArray(int[] a,int[] b,int[] c)
	{	
		int i=0,j=0,k=0;
		while (i<a.length && j<b.length && k<c.length)
		{
			if (a[i]==b[j] && b[j]==c[k])
			{
			System.out.print(a[i]+" ");
				i++;
				j++;
				k++;
			}
			else if (a[i]<b[j])
			{
				i++;
			}
			else if (b[j]<c[k])
			{
				j++;
			}
			else
			{
				k++;
			}
		}
		
		
	}	
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,10};
		int[] b = {1,3,4,10};
		int[] c = {2,3,4,10};
		threeSortArray(a,b,c);	
	}
}
