import java.util.Scanner;
class P28
{
	static void checkPorN(int n)
	{
		if (n>0)
		System.out.print("The number is positive");
		else if (n==0)
		System.out.print("The number is zero");
		else
		System.out.print("The number is negative");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		if (n>1000000)
		System.out.print("The number is large");
		else
		checkPorN(n);
	}
}
