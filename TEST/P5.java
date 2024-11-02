import java.util.Scanner;
public class P5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=n;j++)
			{
				if (j==n||j==1||i==1||i==n)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
