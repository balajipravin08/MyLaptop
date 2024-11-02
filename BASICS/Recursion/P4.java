class P4
{

static int sum=0;
static int fact(int n){
if (n==0)
{
return 0;
}else{
return sum*10+n%10;
fact(n/10);
}
}


public static void main(String[] args)
{
fact(1282);
System.out.print(fact(1282));


}
}
