import java.util.Scanner;
public class P1
{
	static void find(int[] a,int n,int key)
	{
		int count=0;
		for (int i=0;i<n;i++)
		{
			if (a[i]==key)
			{
				count=1;
				System.out.print(i);
			}
		}
		if (count==0)
		System.out.print("-1");
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
			a[i]=sc.nextInt();
		}
		
		find(a,n,key);
		
	}
}
