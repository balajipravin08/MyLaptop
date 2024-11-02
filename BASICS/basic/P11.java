import java.util.*;
public class P11{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int r = rand.nextInt(101);
        int count=0;
        System.out.print(r);

        while(true){

        System.out.print("Guess the number b/w 1 to 100  : ");
        int n= sc.nextInt();

        if(r==n){
            
            System.out.println("You Guessed the correct number ");
            System.out.print("Total no of attempts is " +count);
            
        
        if(count<=10){
            System.out.print("Good job ");
        }else if (count>=n/2){
            System.out.print("Your guess is too high ");
        }else if (count>n/4 && count<n/2){
            System.out.print("Your guess is high ");
        }else if (count<n/4&&count>n/10){
        System.out.print("Your guess is low ");
        }
        break;
        }else 
        count++;
        }
    }
}