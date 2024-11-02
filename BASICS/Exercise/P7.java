class P7
{
static void distinct(int a[],int n)
{
int count=0;
for (int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++){
if (a[i]==a[j])
{
a[j]=0;
count++;
}

}
if(count==0&&a[i]!=0)
{
System.out.print(a[i]+" ");
}
count=0;
}

}

public static void main(String[] args)
{
int a[]={1,4,5,3,1,5};
int n= a.length;
distinct(a,n);
}
}
