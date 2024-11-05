import java.util.Scanner;

public class Calculator {

    private static int add(int a , int b){return a+b;}
    private static int sub(int a , int b){return a-b;}
    private static long mul(int a , int b){return (long)a*b;}
    private static double div(int a , int b){return (double)a/b;}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num1 : ");
        int a = sc.nextInt();
        System.out.println("Enter a num2 : ");
        int b = sc.nextInt();

        while (true) {
            System.out.println("Enter a Operator (+ , - , * , / ) 'e' to exit : ");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println(add(a, b));
                    break;
                case '-':
                    System.out.println(sub(a, b));
                    break;
                case '*':
                    System.out.println(mul(a, b));
                    break;
                case '/':
                    System.out.println(div(a, b));
                    break;
                case 'e':
                    return;
                default:
                    System.out.println("invalid Operator");
                    break;
            }   
        }
    }
}
