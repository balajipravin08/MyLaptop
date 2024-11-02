import java.util.Scanner;
class P3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter number 2 : ");
		int n2 = sc.nextInt();
		System.out.print("Enter number 3 : ");
		int n3 = sc.nextInt();
		
		int result = (n1>n2&&n1>n3)?n1:(n2>n3&&n2>n1)?n2:n3;	
		System.out.print("The Greatest value is : "+result);
	}
}
