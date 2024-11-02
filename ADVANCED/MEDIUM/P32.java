import java.util.Scanner;
class P32
{
	static void check(float num1,float num2)
	{
		num1 = Math.round(num1);
		num1 = num1/100;
		num2 = Math.round(num2);
		num2 = num2/100;
		if (num1==num2)
		System.out.print("Same");
		else
		System.out.print("not Same");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		float num1 = sc.nextFloat();
		System.out.print("Enter number 2 : ");
		float num2 = sc.nextFloat();
		check(num1,num2);
	}
}
