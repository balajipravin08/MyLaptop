import java.util.Scanner;
import java.util.Arrays;
class P10
{
	static void rotate(int[] a,int r)
	{
	int temp,j=0;
	int n=a.length;
	if(r<0)
	r=r+n;
	if (r>n)
	r=r%n;
	
	while(j<r)
	{
		temp=a[0];
		for(int i=1;i<n;i++)
		{
			a[i-1]=a[i];
		}
		a[n-1]=temp;
		j++;
	}
		System.out.print(Arrays.toString(a));	
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] a = {1,2,3,4,5};
		int r = 0;
		rotate(a,r);
		
		
		
	}
}
