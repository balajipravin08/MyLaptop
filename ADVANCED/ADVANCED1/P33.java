import java.util.Scanner;
import java.util.Arrays;
class P33
{
	static void duplicates(int[] num,int len)
	{	
	int count = 0;
		for (int i=0;i<len;i++)	
		{
			for (int j=i+1;j<len;j++)
			{
				if (num[i]==num[j]&&num[i]!=0)
				{
					count++;
					num[j]=0;
				}
				
			}
		}
		 int length= len-count;
		System.out.print("the new array length is : "+length);
		
		
	
	}	
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6,7,7,1,2,3,4,5,6,7}; 
		int len = a.length;
		duplicates(a,len);
		
	}
}
