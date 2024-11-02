import java.util.Scanner;
class P7
{
	static void removeAnElement(int[] num,int key)
	{	
		for (int i=0;i<num.length;i++)
		{
			if (key==num[i])
			{
				int count=i;
				for(int j =count;j<num.length-1;j++)
				{
					num[j]=num[j+1];
				}
			}
		}
		for(int i=0;i<num.length-1;i++)
		{
			System.out.print(num[i]+" ");
		}
	}	
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		int key = 3;
		removeAnElement(a,key); 
	}
}
