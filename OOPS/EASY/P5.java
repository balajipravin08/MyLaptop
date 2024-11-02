import java.util.Scanner;
public class P5 {
	private static int factorial(int n) {
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for factorial : ");
		int n = sc.nextInt();
		System.out.print("the factorial of  "+n+" is : "+factorial(n));
	}
}
