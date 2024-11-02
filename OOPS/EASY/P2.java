import java.util.Scanner;
public class P2
{
	private String reverse(String s){
		String reverse = "";
		for (int i=s.length()-1;i>=0;i--){
			char c = s.charAt(i);
			reverse = reverse + c ;
		}
		return reverse;
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		P2 obj = new P2();
		System.out.print("The reversed String is : "+obj.reverse(s));
	}
}
