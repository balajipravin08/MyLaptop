import java.util.Scanner;
class P7{

	
	static int lcm(int num1,int num2)
	{
	return (num1*num2)/gcd(num1,num2);
	}
	static int gcd(int num1,int num2){
		
		if (num1==0)
		return num2;
		
		else if (num2==0)
		return num1;
		
		else if (num1==num2)
		return num1;
		
		else if (num1>num2)
		return gcd(num1%num2,num2);
		
		else
		return gcd(num1,num2%num1);
	
	}

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a num1 : ");
	int num1 = sc.nextInt();
	System.out.print("Enter a num2 : ");
	int num2 = sc.nextInt();
	
	System.out.print(lcm(num1,num2));
	System.out.print(gcd(num1,num2));
}
}
