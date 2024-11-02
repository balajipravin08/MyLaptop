import java.util.*;
import java.lang.*;

class P3{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string :");
String s = sc.nextLine();
int len=s.length();
char ch =' ';
String result="";
String rews="";		
for (int i=0;i<len;i++)
{
if (s.charAt(i)==' ')
continue;
else
{
if (s.charAt(i)>='A'&&s.charAt(i)<='Z')
ch=(char)(s.charAt(i)+32);

else
ch=(char)(s.charAt(i));
result=result+ch;
}
}
for(int i=result.length()-1;i>=0;i--){
rews=rews+result.charAt(i);
}
if(result.equals(rews))
System.out.print("palindrome");
else
System.out.print("not a palindrome");

}
}




