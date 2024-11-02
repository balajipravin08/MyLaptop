import java.util.Scanner;
class P1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a size of an array : ");
int n = sc.nextInt();
int num[]=new int[n];
int len = num.length;
int sum=0;

for (int i =0;i<len;i++)
{
System.out.print("Enter a num of index of  "+i+" ");
num[i] = sc.nextInt();
}
for (int i =0;i<len;i++)
{
sum=sum+num[i];
}
System.out.print(sum);

}

}
