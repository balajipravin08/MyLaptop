import java.util.Scanner;
class P1
{
static void fahCel (float fah){

float cel = (fah-32)*5/9;
System.out.println(fah+" degree Fahrenheit is equal to "+cel+" in Celsius");

}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a fahrenheit : ");
float fah = sc.nextFloat();
fahCel(fah);

}
}
