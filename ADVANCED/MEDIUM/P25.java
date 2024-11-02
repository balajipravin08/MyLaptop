import java.util.Scanner;
class P25
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int number,count =0;
		
		for (int i=1;i<2*n;i++)
		{
		
			if (i<=n)
			{
				count= 2*i-1;
				number = i;
			}
			else
			{
				count = count-2;	
				number = 2*n-i;
			}
			
				for (int j=1;j<=count;j++)
				{
					System.out.print(number+" ");
					int mid = count/2 + 1;
					if(j<mid)
					{
						number--;
					}
					else
					{
						number++;
					}	
				}
				System.out.println();			
		}
	}
}
