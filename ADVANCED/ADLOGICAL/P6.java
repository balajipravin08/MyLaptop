import java.util.Scanner;
class P6
{
	static void check (char[][] a,String s)
	{
		for (int i=0;i<a.length;i++)
		{
		int c1=0;
			for (int j=0;j<a.length;j++)
			{
				if (a[i][j]==s.charAt(j))
				{
				c1++;
					if (j==a.length-1&&c1==s.length())
					{
						System.out.print("element found in "+i +" row ");
						break;
					}
				}
			}
		}
		int count =0;
			
		
		while (count<a.length)
		{
		int c=0;
			for (int i=0;i<a.length;i++)
			{
				if (a[i][count]==s.charAt(i))
				{
					c++;
					if (i==a.length-1 && c==s.length())
					{
						System.out.print("element found in "+count +" col ");
						break;
					}
				}
			}
			count++;
		}
		
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String s = "FBOS";
		char[][] a ={	{'F', 'A', 'C', 'I'},
				{'O', 'B', 'Q', 'P'},
				{'A', 'N', 'O', 'B'},
				{'M', 'A', 'S', 'S'}  };
			     
			     
			     check(a,s);		
	}
}
