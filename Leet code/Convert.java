import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length in meter : ");
        double a = sc.nextDouble();
        System.out.println("Centimeter : "+(a*100));
        System.out.println("Inches : "+(a*39.37));
        System.out.println("Feet : "+(a*3.28));
    }
}
