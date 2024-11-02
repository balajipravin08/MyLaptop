import java.util.Scanner;

class P3//hollow prymid
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a num of lines : ");
		int n= sc.nextInt();
			
			for(int i=0;i<n;i++)
			{
				for(int s=0;s<n-i-1;s++)
				{
				System.out.print("  ");
				}
				
					for(int j=0;j<2*i+1;j++)
					{
					if(j==0||j==2*i||i==n-1)
					System.out.print("* ");
					else
					System.out.print("  ");
					
					}
				
				System.out.println();
				}
				
				
	}
	
}
