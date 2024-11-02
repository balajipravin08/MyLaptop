import java.util.Scanner;
class P32
{
	static void checkArray(int[] a)
	{	
		
		int x=0,y=0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==65)
			{
				x++;				
			}
			else if (a[i]==77)
			{
				y++;
			}
			
		}
		if (x>=1&&y>=1)
		{
			System.out.print("contains 65 and 77");
		}
		else
		{
			System.out.print("Not contains 65 and 77");
		}
		
	}	
	
	public static void main(String[] args)
	{
		int[] a = {77,77,6}; 
		checkArray(a);
		
		
	}
}
