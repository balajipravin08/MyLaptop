import java.util.Scanner;
class P12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a n1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter a n2 : ");
		int n2 = sc.nextInt();
		System.out.print("Enter a n3 : ");
		int n3 = sc.nextInt();
		System.out.print("Enter a n4 : ");
		int n4 = sc.nextInt();
		System.out.print("Enter a n5 : ");
		int n5 = sc.nextInt();
		int sum = n1+n2+n3+n4+n5;
		double avg = sum/5;
		System.out.println("The sum is : "+sum);
		System.out.println("The average is : "+avg);
		
		
		
	}
}
