class P9 {
static void longestSubarray(int a[],int n)
{
int max=0;
int index=0;
int count=1;

	for (int i=1;i<n;i++)
	{
		if (a[i-1]<a[i])
		count++;
	else{ 

if (max<count){
max=count;
index=i-max;
}
count=1;
}
if(i==n-1)
{
if(max<count){
max=count;
index=i-max+1;
}
}
}
System.out.println(max);

for (int i=index;i<index+max;i++)
{
System.out.print(a[i]+" ");
}
}

public static void main(String [] args)
{
int a[]={10, 22, 25, 32, 54, 64,100, 101};
int n= a.length;
longestSubarray(a,n);

}
}
