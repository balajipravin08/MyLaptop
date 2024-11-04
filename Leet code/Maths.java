import java.util.Scanner;

public class Maths {

    private static int sum(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}