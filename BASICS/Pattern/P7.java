import java.util.Scanner;

class P7//hollow square
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a num of lines : ");
		int n= sc.nextInt();
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
				  if(i==n-1||j==0||i==0||j==n-1)
				  System.out.print("* ");
				  else
				  System.out.print("  ");
				
				}
			System.out.println();	
			}
	
	}
}
