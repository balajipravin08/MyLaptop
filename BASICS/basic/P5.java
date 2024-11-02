import java.util.*;
public class P5{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int num= sc.nextInt();
        if(num>=18)
        System.out.print("You are adult");
        else 
        System.out.print("You are not yet an adult");


    }
}