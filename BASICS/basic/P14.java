import java.util.*;
import java.lang.*;

class P14{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string :");
String str = sc.nextLine();
String rev="";
int len =str.length();
while(len>0)			
{
rev=rev+str.charAt(len-1);
len--;

}
//System.out.print(rev);

if (str.equals(rev)){
System.out.println("palindrome");
}else{
System.out.println("not panlidrome");
}
}
}
