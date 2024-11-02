import java.util.Scanner;
class P22
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		String s = "";
		for (int i=0;i<n;i++)
		{
			int count =0;
			int v = (int)Math.pow(11,i);
			s= Integer.toString(v);
			for (int j=0;j<=n-1;j++)
			{
				if (j<n-i-1)
				System.out.print(" ");
				else
				System.out.print(s.charAt(count++)+" ");
			}
			System.out.println();
			
		}
		
		
		
		
	}
}
