import java.util.*;
class P4{
public static void main (String[] args){
int n1=0;
int n2=1;
int sum=0;


Scanner sc = new Scanner(System.in);
System.out.print("enter a number :");
int n = sc.nextInt();
System.out.print(n1+" "+n2);


for(int i=0;i<n-2;i++){
sum=n1+n2;
n1=n2;
n2=sum;
System.out.print(" "+sum);
}
}
}
