import java.util.Scanner;
class P6 {
public static void main(String[] args)
{
String s="ABCabc";
int len=s.length();
Scanner sc = new Scanner(System.in);
System.out.print("Enter a character : ");

char n= sc.next().charAt(0);
System.out.println();
//char n ='d';
for (int i=0;i<len;i++)
{
if (s.charAt(i)==' '||s.charAt(i)==n||s.charAt(i)==n-32||s.charAt(i)==n+32)
continue;
else
System.out.print(s.charAt(i));
}
}
}

