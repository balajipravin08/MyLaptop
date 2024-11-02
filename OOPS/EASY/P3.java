import java.util.Scanner;
public class P3
{
	private String reverse(String s){
		String reverse = "";
		for (int i=s.length()-1;i>=0;i--){
			char c = s.charAt(i);
			reverse = reverse + c ;
		}
		return reverse;	
	}
	private boolean isPalindrome(String s){
		if (reverse(s).equals(s))
		return true;
		return false;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		P3 obj = new P3();
		System.out.print(obj.isPalindrome(s));
	}
}
