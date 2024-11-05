import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of an array : ");
        int len = sc.nextInt();
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter a num on index "+i+" : ");
            a[i]=sc.nextInt();
        }
        int sum = 0;
        for (int i : a) {
            if (i%2==0) sum+=i;
        }
        System.out.println(sum);
    }
}