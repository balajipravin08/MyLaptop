	import java.util.Scanner;
class P5 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a weight : ");
		double wp = sc.nextInt();
		System.out.print(" Enter a height : ");
		double hi = sc.nextInt();
		
		double wkg = wp*0.453592;
		double hm = hi*0.0254;
		double bmi = wkg/(hm*hm);
		
		System.out.print("The body mass index of "+ wp + " weight "+hi+ " height is "+ bmi); 
		
		
	}
}
