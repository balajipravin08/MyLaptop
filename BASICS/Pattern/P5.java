																																																																																																																																																																																																																																																																																																																																											import java.util.Scanner;

class P5//Diamond
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a num of lines : ");
		int n= sc.nextInt();
		int l;
			
			for(int i=1;i<2*n;i++)
			{
				
				for(int j=1;j<2*n;j++)
					{
					if (i<=n){
					
					if (j==n-(i-1)||j==n+(i-1))
					System.out.print("* ");
					else
					System.out.print("  ");
					}
					else if (i>n && i<2*n)
					{
					if (j>=1+(n-i))
					System.out.print("* ");
					//else
					//System.out.print("  ");
					}
					
					}
				
				System.out.println();
				}
				
				
	}
	
}
