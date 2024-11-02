import java.util.Scanner;
class P1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a String : ");
String str = sc.nextLine();

int vCount=0;
int cCount=0;

for (int i=0;i<str.length();i++)
{
char ch = str.charAt(i);
if(str.charAt(i)==' '){
continue;
}

if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
	str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
vCount++;
else
cCount++;

}
System.out.println("The vovel count in a string is  : "+vCount);
System.out.print("The consonant count in a string is  : "+cCount);

if(vCount>0)
System.out.print("true");
else
System.out.print("false");

}
}
