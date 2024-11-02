import java.util.Scanner;

class P4//prymid
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a num of lines : ");
		int n= sc.nextInt();
			
			for(int i=0;i<n;i++)
			{
				for(int s=0;s<n-i-1;s++)
				{
				System.out.print("  ");
				}
				
					for(int j=0;j<2*i+1;j++)
					{
					if (i==0||j==0)
					{
					pr=1;
					System.out.print(pr);
					}
					else{
					pr=pr*(i-j+1)/j;
					System.out.print(pr);
					}
					}
				
				System.out.println();
				}
				
				
	}
	
}
