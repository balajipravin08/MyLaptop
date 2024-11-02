import java.util.*;
class Ap1
{
static void secondLargestElement(int arr[],int n)
{
int tem=0;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if (arr[i]>arr[j]){
tem=arr[i];
arr[i]=arr[j];
arr[j]=tem;}
}
}
System.out.print("The second largest num in the array is : "+arr[1]);
}
public static void main(String[] args)
{
int arr[] ={1,2,3,4};
int n= arr.length;

secondLargestElement(arr,n);

}
}
