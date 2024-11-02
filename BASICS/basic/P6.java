import java.util.Scanner;
public class P6{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature in Celsius : ");
        int c= sc.nextInt();
        int f=(c*9/5)+32;
        System.out.print("Enter Temperature in fahrenheit are  : " + f);


    }
}