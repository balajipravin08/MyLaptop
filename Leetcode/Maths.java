import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maths {

    private static int sum(int n){
        return n*(n+1)/2;
    }

    private static long factorial(int n){
        long res = 1;
        if (n==0||n==1) {return 1;}
        for (int i = 1; i <= n; i++) {
            long temp =(long)res*i;
            res=temp;
        }
        return res;
    }

    private static int trailingZeroes(int n){
        int power = 5;
        int zero = 0;
        while (n>=power) {
            zero+=(n/power);
            power*=5;
        }
        return zero;
    }

    private static int gcd(int a , int b){
        
        while (a!=0 && b!=0){
            if (a>b) a=a%b;
            else b=b%a;
        }
        if (a==0) return b;
        return a;
    }

    private static int lcm (int a , int b){
        return (a*b)/gcd(a, b);
    }

    private static boolean isPrime(int n){
        if(n==0 || n==1) return false;
        if(n==2||n==3) return true;
        if (n%2==0||n%3==0) return false;

        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }

    private static List<Integer> printPrimes(int n){
        boolean[] prime = new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(prime[i]==false){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=true;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(prime[i]==false){
                list.   add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        // System.out.println(sum(n));
        // System.out.println(factorial(n));
        // System.out.println(trailingZeroes(n));
        // System.out.println("Enter a number : ");
        // int a = sc.nextInt();
        // System.out.println("Enter a number : ");
        // int b = sc.nextInt();
        // System.out.println(gcd(a, b));
        // System.out.println(lcm(a, b));
        System.out.println(isPrime(n));
        System.out.println(printPrimes(n));

        
    }
}