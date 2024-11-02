import java.util.Scanner;
class P31
{
	static void checkEqual(int n1,int n2,int n3)
	{
		String result = (n1<n2&&n2<n3)?"All numbers are increasing":(n1>n2&&n2>n3)?"All numbers are decreasing":"Neither all are increasing or decreasing";
		
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
