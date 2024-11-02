import java.util.Scanner;
class P2
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a size of an array : ");
int n = sc.nextInt();
int num[]=new int[n];
int len = num.length;
int max = num[0];
int min = num[0];

for (int i =0;i<len;i++)
{
System.out.println("Enter a num of index of  "+i+" ");
num[i] = sc.nextInt();
}

for (int i =0;i<len;i++)
{
System.out.print(num[i]);
}

System.out.println();
for (int i =0;i<len;i++)
{
if (num[i]>max)
{
max=num[i];
}
}
System.out.println("Largest num of an array is  : "+max);

}

}
