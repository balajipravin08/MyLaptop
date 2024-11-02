class Ap5 {
static void commonElement(int a[],int b[],int n,int m)
{
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
if (a[i]==b[j]){
System.out.print(a[i]+" ");
}
}
}
}

public static void main(String [] args)
{
int a[]= {1,2,3,4,5};
int b[]= {1,6,7,3,9,5};
int n=a.length;
int m=b.length;
commonElement(a,b,n,m);

}
}
