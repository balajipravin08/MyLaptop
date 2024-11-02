import java.util.Scanner;
class P6
{
static void removeSpace(String s,int len)
{
String str = "";
for (int i=0;i<len;i++)
{
if (s.charAt(i)==' ')
continue;
else
str=str+(char)(s.charAt(i));
}
System.out.print(str);

}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string : ");
String s = sc.nextLine();
int len=s.length();

removeSpace(s,len);




}

}
