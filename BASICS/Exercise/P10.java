class P10{
static void shortestSubarray(int a[],int n)
{
int min = Integer.MAX_VALUE;
int index=0;
int count=1;
for(int i=1;i<n;i++)
{
if (a[i-1]<a[i])
count++;

else{
if(min>count){
min=count;
index=i-min;
}
count=1;
}
if(i==n-1){
if(min>count){
min=count;
index=i-min+1;
}
}
}
System.out.println(min);
for(int i=index;i<index+min;i++){
System.out.print(a[i]+" ");
}

}

public static void main(String[] args)
{
int a[]={10, 22, 33, 25, 32, 54, 64, 1}	;
int n=a.length;
shortestSubarray(a,n);
}
}
