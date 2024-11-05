import java.time.Year;
import java.util.Scanner;

public class CalculateBirthYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Age : ");
        int a = sc.nextInt();
        Year year =Year.now();
        System.out.println(year.getValue()-a);
    }
}
