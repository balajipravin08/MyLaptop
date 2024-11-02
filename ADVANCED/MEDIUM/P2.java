import java.util.*;
class P2
{
	static void quadricEquation(int a,int b,int c)
	{
		double d = (b*b)-4*a*c;
		
		if (d>0)
		{
			double root1 = -b+Math.sqrt(d)/2*a;
			double root2 = -b-Math.sqrt(d)/2*a;
			System.out.print(root1+" real and imaginary "+root2);
		}
		else if (d==0)
		{
			double real = -b/2*a;
			System.out.print(" r"+real);
		}
		else 
		{
			double imag =-b+Math.sqrt(-d)/2*a;
			System.out.print(imag);
		}
	}	
	
	public static void main(String[] args)
	{
		int a = 1;
		int b = -3;
		int c = 10;
		quadricEquation(a,b,c);		
	}
}
