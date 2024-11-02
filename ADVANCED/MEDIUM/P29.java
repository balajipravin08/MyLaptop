import java.util.Scanner;
class P29
{
	static void checkPorZorN(long n)
	{
		int count =0;
		if(n>0)
		{
			while (n>0)
			{
				n = n/10;
				count++;
			}
			System.out.print("The length of the digit is : "+count);	
		}
		else 
		System.out.print("The given number is negative");
		
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		long n = sc.nextLong();
		if (n>10000000000l)
		System.out.print("The number is large");
		else
		checkPorZorN(n);
	}
}
