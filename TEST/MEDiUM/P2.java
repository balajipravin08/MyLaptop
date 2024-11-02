import java.util.Scanner;
public class P2
{
	static String swap(char[] a,int n,int k)
	{
		char temp =' ';
		int count =k-1;
		for (int i=0;i<n;i++)
		{
			if (count==i)
			{
				temp=a[i];
				a[i]=a[i-1];
				a[i-1]=temp;
				count +=4;
			}
		}
		String str = new String(a);
		return str;
	}
	public static void main(String[] args)
	{
		String s = "abcdefghijklmn";
		int k=3;
		char[] ch = new char[s.length()];
		ch = s.toCharArray();
		int n = ch.length;
		System.out.print(swap(ch,n,k));
		
			
	}
}
