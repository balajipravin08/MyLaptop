import java.util.*;
public class P12{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        
        int len = str.length();
        String reverse = "";

        while(len>0){
        reverse = reverse+str.charAt(len-1);
        len--;
        
        }
        System.out.print(reverse);

       
        


    }
}