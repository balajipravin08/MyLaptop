import java.util.Scanner;
class P38
{
	public static void majority(int a[], int n)
	{
		int max =0;
		int index = 0;
		int count =0;
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					
					count++;
				}
			}
			
			if(count>max)
			{
				max = count;
				index = i;
				
			}
			count =0;

		}
		
		if(max>n/2)
		{
			System.out.println(a[index]+" "+max);
		}
		else
		{
			System.out.println("There is no majority element in Array");
		}
		
		
	}
		
	public static void main(String[] args)
	{
		int[] a = {1,1,1,1,2,2,2,2,2,2,2}; 
		int n = a.length;
		majority(a,n);
		
		
	}
}
