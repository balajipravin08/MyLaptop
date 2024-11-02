import java.util.*;
public class P8{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num= sc.nextInt();
        int min= 1;
        int max=100;


        if(num>max/2 && num<=max)
        System.out.print("the number is in upper half");
        else if(num<max/2 && num>=min)
        System.out.print("the number is in lower half");
        else
        System.out.print("the number is out of range");


    }
}