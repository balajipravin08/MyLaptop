import java.util.*;
public class P4{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num : ");
        int num= sc.nextInt();
        if(num==0)
        System.out.print("Zero");
        else if (num>0)
        System.out.print("num is Positive");
        else 
        System.out.print("num is negative");


    }
}