import java.util.Scanner;
class P30
{
	static void checkEqual(int n1,int n2,int n3)
	{
		String result = (n1==n2&&n2==n3&&n3==n1)?"All numbers are equal":(n1==n2||n2==n3||n3==n1)?"Neither all are equal or different":"All numbers are different";
		
		System.out.print(result);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter a number2 : ");
		int n2 = sc.nextInt();
		System.out.print("Enter a number3 : ");
		int n3 = sc.nextInt();
		
		checkEqual(n1,n2,n3);
	}
}
