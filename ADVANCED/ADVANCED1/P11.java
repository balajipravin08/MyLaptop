import java.util.Scanner;
import java.util.Arrays;
class P11
{
	static void reverse(int[] num,int len)
	{	
		for (int i=len-1;i>=0;i--)	
		{
			System.out.print(num[i]+" ");
		}
		
	
	}	
	
	public static void main(String[] args)
	{
		int[] a = {9,6,3,4,5}; 
		int len = a.length;
		reverse(a,len);
		
	}
}
