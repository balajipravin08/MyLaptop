import java.util.Scanner;
class P3
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a size of an array : ");
int n = sc.nextInt();
double num[]=new double[n];
int len = num.length;
double sum=0;

for (int i =0;i<len;i++)
{
System.out.print("Enter a num of index of  "+i+" ");
num[i] = sc.nextDouble();
}

for (int i =0;i<len;i++)
{
System.out.print(num[i]);
}
System.out.println();

for (int i =0;i<len;i++)
{
sum=sum+num[i];
}
System.out.print("The average element of an array : "+ sum/len);

}

}
