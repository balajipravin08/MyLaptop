import java.util.Scanner;
public class P3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n+i;j++)
			{
				if (j<n-i-1)
				{
					System.out.print("  ");
				}
				else
				{
					if (i+j==n-1||i==n-1||j==n+i-1)
					System.out.print("* ");
					else
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
