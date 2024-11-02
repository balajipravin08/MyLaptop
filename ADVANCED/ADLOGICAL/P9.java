import java.util.Scanner;
class P9
{
	static void check(int n)
	{
		int d = 10-n;
		int sum = n + d;
		if (sum==10&&d>=0)
		{
			System.out.print(n+" "+d);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		if (n<0)
		System.out.print("The number is negative");
		else
		check(n);
		
		
	}
}
