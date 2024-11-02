import java.util.*;
class Ap2
{
static void largestAndshortest(int a[],int n){
int temp=0;
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if (a[i]<a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
}


public static void main(String[] args)
{
int a[] ={1,2,3,4};
int n= a.length;
largestAndshortest(a,n);
System.out.println("The largest num in the array is : "+a[0]);
System.out.println("The smallest num in the array is : "+a[n-1]);

}
}
