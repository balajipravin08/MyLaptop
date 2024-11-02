import java.util.Scanner;
public class P10 {
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter num : ");
    	int num = sc.nextInt();
    	String s = Integer.toString(num);
    	
    	for (int i = 0;i<s.length();i++)
    	{
    		 System.out.print(s.charAt(i)+" ");
    	}
    	
    	
    }
}    	
