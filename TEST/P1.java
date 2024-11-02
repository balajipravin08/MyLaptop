import java.util.Scanner;
public class P1
{
	static int distinct(int[] a,int n,int key)
	{
		for (int i=0;i<n;i++)
		{
			if (a[i]==key)
			{
				return i;
			}
			else if (a[i]>key)
			{
				return i;
			}
		}
			return n;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of an array : ");
		int n = sc.nextInt();
		System.out.print("Enter a key value : ");
		int key = sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.print("Enter a number of index : "+i);
			a[i]=sc.nextInt();;	
		}
		
		System.out.print(distinct(a,n,key));
		
	}
}
