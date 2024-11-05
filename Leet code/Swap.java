import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num1 : ");
        int a = sc.nextInt();
        System.out.println("Enter a num2 : ");
        int b = sc.nextInt();
        System.out.println(a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}
