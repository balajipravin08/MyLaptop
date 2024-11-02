import java.util.*;
public class P3{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int num1= sc.nextInt();

        System.out.print("Enter num2 : ");
        int num2=sc.nextInt();

        if(num1==num2)
        System.out.print("Both are equal");
        else if (num1>num2)
        System.out.print("num1 is greater");
        else 
        System.out.print("num2 is greater");


    }
}