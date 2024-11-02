import java.util.Scanner;
class P15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a n1 : ");
		int n1 = sc.nextInt();
		int count=1;
		int i=1;
		int sum=0;
		while(count<=n1)
		{
			if (i%2!=0)
			{
				count++;
				System.out.println(i);
				sum = sum +i;
			}
			i++;
			
		}
		System.out.println("The sum of these odd number is : "+ sum);
		
		
		
	}
}
