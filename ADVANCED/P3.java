import java.util.Scanner;
class P3
{
	static void cDigit (int num)
	{
		int count,sum =0;
		
		
		while(num!=0)
		{
		sum = sum + num%10;
		num = num/10;
	      
		}
		System.out.print("The sum of this Digit is : "+sum);
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number 0 to 1000 : ");
		int num = sc.nextInt();
		cDigit(num);
				
		
	
	}
}
