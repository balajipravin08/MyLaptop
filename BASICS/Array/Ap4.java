import java.util.Scanner;
class Ap4
{
static void rotate(int a[],int t[],int n,int r){
int k=0;
r=r%n;
if(r<0)
r=r+n;

for(int i=r;i<n;i++)
{
t[k]=a[i];
k++;9
}
for(int i=0;i<r;i++)
{
t[r]=a[i];
k++;
}

for(int i=0;i<n;i++)
{
System.out.print(t[i]+" ");
}
}

static void rotate(int a[],int n,int r)
{
int i=0;
while(i<r)
{
	int temp=a[0];
	for(i=1;i<n;i++)
	{
		a[i-1]=a[i];
	}
	a[n-1]=temp;
	i++;
}

for(i=0;i<n;i++){
System.out.print(a[i]+" ");
}
}	
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the no of rotate : ");
int r=sc.nextInt();

int a[]={13,20,33,24,65};

int n=a.length;
int t[]=new int [n];
rotate(a,n,r);
}
}
