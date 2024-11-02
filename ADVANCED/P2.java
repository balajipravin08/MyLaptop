import java.util.Scanner;
class P2
{
	static void inMet (float inch)
	{
		float meter = 0.0254f*inch;
		System.out.print(inch + " inch is equal to "+ meter+" in meter");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value in inch : ");
		float inch = sc.nextFloat();
		inMet(inch);
	}
}
