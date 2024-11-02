class P16{
public static void main(String[] args)
{
String a[]={"balaji","ashok","chandru","anand"};
String temp="";

for (int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i].charAt(0)>a[j].charAt(0))
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
System.out.print(a[i]+" ");
}
}
}
