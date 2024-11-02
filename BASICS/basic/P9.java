import java.util.Scanner;
class P9
{
public static void main(String [] args)
{
Scanner sc = new Scanner (System.in);
System.out.print("Enter a string : ");
String s=sc.nextLine();
String t="java";
boolean found=false;
int i,j;
for(i=0;i<s.length();i++){
for (j=0;j<t.length();j++){
if (s.charAt(i+j)!=t.charAt(j))
break;
}
if(j==t.length())
{
found=true;
break;
}
}
if (found)
System.out.print("the string contains java");
else
System.out.print("the string not contains java");
}
}
