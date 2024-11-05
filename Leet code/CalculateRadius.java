import java.util.Scanner;

public class CalculateRadius {
    private static double area(double radius){
        double area =(double)Math.pow(radius,2) * Math.PI; 
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Radius : ");
        double a = sc.nextDouble();
        System.out.println(area(a));

    }
}
