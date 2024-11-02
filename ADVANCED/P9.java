import java.util.Scanner;
public class P9 {
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter num1 : ");
    	int num1 = sc.nextInt();
    	System.out.println("Enter num2 : ");
    	int num2 = sc.nextInt();
    		
    		int sum = num1+num2;
    		System.out.println("sum is : "+ sum);
    		int difference = num1-num2;
    		System.out.println("difference is : "+difference);
    		int product = num1*num2;
    		System.out.println("product is : "+ product);
    		float average = sum/2;
    		System.out.println("average is : "+ average);
    		int min = (num1<num2)?num1:num2;
    		int max = (num1>num2)?num1:num2;
    		int distance = max-min;
    		System.out.println("distance is : "+ distance);
    		System.out.println("max is : "+ max);
    		System.out.println("min is : "+ min);
    }
    
}
