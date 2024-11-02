import java.util.*;
public class P3{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int r = rand.nextInt(11);
        int max=10;
        int min=1;
        int count=0;
        //System.out.print(r);

        while(true){

        System.out.print("Guess the number b/w 1 to 10  : ");
        int n= sc.nextInt();

        if(r==n){
            
            System.out.println("You Guessed the correct number ");
            System.out.print("Total no of attempts is " +count);
            
        
        if(count<=2){
            System.out.print("Good job ");
        }else if (count>=max/2){
            System.out.print("Your guess is too high ");
        }else if (count>max/4 && count<max/2){
            System.out.print("Your guess is high ");
        }else if (count<max/4&&count>max/10){
        System.out.print("Your guess is low ");
        }
        break;
        }else 
        count++;
        }
    }
}

