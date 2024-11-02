class P8
{
static int lcm(int a,int b)
{
return (a*b)/gcd(a,b);
}

static int gcd(int a,int b){

while(a!=0&&b!=0){
if (a>b){
a=a%b;
}
else{
b=b%a;
}
}
if (a!=0)
return a;
else
return b;

}
public static void main (String[] args)
{
System.out.print(gcd(22,13));
}
}
