import java.util.*;


class P15 {
public static void main(String[] args){



Scanner sc = new Scanner(System.in);
int [] arr = new int[5];
int len = arr.length;
int i=0;
for (i=0;i<len;i++){
System.out.println("Enter a element of index : "+i);
arr[i]= sc.nextInt();
}
System.out.println(arr[i]);




int value = arr[0];
int value1 = arr[0];

for(i=0;i<len;i++)
{
if(arr[i]<value)
{
value=arr[i];
}
if(arr[i]>value1)
{
value1=arr[i];
}
}
System.out.println("greatest num is  : "+ value1);
System.out.println("lowest num is  : "+value);

}
}
