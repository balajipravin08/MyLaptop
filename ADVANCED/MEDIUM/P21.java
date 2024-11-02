import java.util.Scanner;
class P21
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int l=0;
		for (int i=-n;i<=n;i++)
		{
			if (i<0)
			l=-i;
			else
			l=i;
			for (int j=0;j<2*(n-l)-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		
		
		
	}
}
