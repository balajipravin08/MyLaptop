import java.util.Scanner;
class P1
{
	static void checkPositiveOrNegative(int num)
	{
		String res = (num<0)?"Negative":(num==0)?"Zero":(num>0)?"Positive":"invalid";
		System.out.print("The given number is : "+ res);
	}	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num : ");
		int num = sc.nextInt();
		checkPositiveOrNegative(num);
		
	}
}
