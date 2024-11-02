import java.util.Scanner;
class P4
{
static void fib(int n1,int n2,int n)
{
System.out.print(n1+" "+n2+" ");
int sum=0;
for (int i=0;i<n-2;i++)
{
sum=n1+n2;
n1=n2;
n2=sum;
System.out.print(sum+" ");
}
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number : ");
int n = sc.nextInt();
fib(0,1,n);
}
}
