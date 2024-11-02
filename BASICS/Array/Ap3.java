import java.util.*;
class Ap3
{
static void aSort(int arr[])
{
for (int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
	if (arr[i]>arr[j])
	{
	int temp = arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	}
}
}
}
static void dSort(int arr[])
{
for (int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
	if (arr[i]<arr[j])
	{
	int temp = arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	}
}
}
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a size of an array : ");
int n= sc.nextInt();

int arr[]=new int[n];

for (int i=0;i<n;i++)
{
System.out.print("Enter a element in an array in the index of  : "+i+": ");
arr[i]=sc.nextInt();
}
System.out.println("The arrays in ascending order ");
aSort(arr);
for (int i=0;i<n;i++)
{
System.out.print(arr[i]+" ");
}
System.out.println();
System.out.println("The arrays in descending order ");
dSort(arr);
for (int i=0;i<n;i++)
{
System.out.print(arr[i]+" ");

}



}
}
