import java.util.Scanner;
import java.util.Arrays;
class P13{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of an array : ");
int n = sc.nextInt();
int num[] = new int[n];
int avg =0;

for(int i=0;i<num.length;i++)
{
System.out.print("Enter a num of index of  "+i+" ");
num [i]=sc.nextInt();
} 

for(int i=0;i<num.length;i++)
{
//System.out.print(num[i]);
avg = avg+num[i];
} 
System.out.print(avg/num.length);




}
}
