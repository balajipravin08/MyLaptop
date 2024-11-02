import java.util.Scanner;
class P8
{
static void index(int arr[],int n)
{
int a=0;
for (int i=0;i<arr.length;i++)
{
if (arr[i]==n){
a=1;
System.out.print(i);
}
}

if(a==0){
System.out.print(-1);
}


}

public static void main(String [] args)
{
Scanner sc = new Scanner (System.in);

System.out.print("Enter a size of an array : ");
int size= sc.nextInt();

int arr[]=new int[size];

for (int i=0;i<arr.length;i++)
{
System.out.print("Enter a element in an array in the index of  : "+i+": ");
arr[i]=sc.nextInt();
}
System.out.print("Enter a number  : ");
int n= sc.nextInt();

index(arr,n);

}
}
