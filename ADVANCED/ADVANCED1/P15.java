import java.util.Scanner;
import java.util.Arrays;
class P15
{
	static void duplicates(int[] str,int[] str1,int len)
	{
	int count =0;
		for (int i=0;i<str.length;i++)	
		{
			for (int j=0;j<str1.length;j++)
			{
				if (str[i]==str1[j]&&str[i]!=0&&str1[j]!=0)
				{
					count++;
					str1[j]=0;
				if (count==1)
				{
					System.out.print(str[i]+" ");
				}
				}
			}
			count=0;
			
		}
		
	}	
	
	public static void main(String[] args)
	{
		int[] str = {1,2,2,4,5,6,6}; 
		int[] str1 = {1,2,2,6,7,6};
		int len = str.length;
		duplicates(str,str1,len);
		
	}
}
