class P35
{
	static void longestConsecutive(int[] a)
	{
		int max = 0;
		int count = 1;
		int index = 0;
		int len = a.length;
		
		for (int i=1;i<len;i++)
		{
			if (a[i]-a[i-1]==1)
			{
				count++;
			}
			else
			{
				if (max<count)
				{
					max=count;
					index=i-max;
				}
				count =1;
			}
			if (i==len-1)
			{
				if (max<count)
				{
					max=count;
					index=i-max+1;
				}
			}
			
		}
		
		for (int i=index;i<index+max;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,10,11,12,13,14,15};
		longestConsecutive(a);
	}
}
