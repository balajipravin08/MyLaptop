import java.util.Scanner;
public class P2
{
	static void distinct(int[] a,int n)
	{
	
		int temp=0;
		for (int i=0;i<n;i++)
		{
			for (int j= i+1;j<n;j++)
			{
				if (a[i]<a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.print("The 3rd maximum number is : "+ a[2]);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of an array : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.print("Enter a number of index : "+i);
			a[i]=sc.nextInt();
		}
		
		if (n>=3)
		distinct(a,n);
		else if (n==2){
		int max = (a[0]>a[1])?a[0]:a[1];
		System.out.print("The maximum number is : "+ max);
		}
		else
		System.out.print("The maximum number is : "+ a[0]);
		
		
	}
}
