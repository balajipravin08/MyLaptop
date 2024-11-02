import java.util.Scanner;
public class P6{//hollow diamond
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter a number : ");
int n = sc.nextInt();
int l;
for (int i = -n;i<=n;i++)
{
  if (i<0)
  l=-i;
  else
  l=i;
  
	for (int j=0;j<2*n-l+1;j++)
	{
		if (j<l)
		{
			System.out.print("  ");
		}else
		{
			if (i==j||j==2*n-l||i+j==0)
			{
				System.out.print("* ");	
			}else
			{
				System.out.print("  ");
			}
		}
	}
	System.out.println();
}

}
}		
