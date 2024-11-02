import java.util.Scanner;
class P27
{
	static void evenAndodd(int[] num,int len)
	{	
		int odd=0,even=0,zero=0;
		for (int i=0;i<len;i++)	
		{
			if (num[i]==0)
			{
				continue;
			}
			else
			{
			if ((num[i]%2)==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			}
			
		}
		
		System.out.println("The count of even number is : "+even);
		System.out.println("The count of odd number is : "+odd);
		
		
		
	
	}
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,0,4,5,0}; 
		int len = a.length;
		evenAndodd(a,len);
		
	}
}
