import java.util.Scanner;

public class Palindrome {
    private static boolean isPalindrome(String s){
        int l=0 , r = s.length()-1;
        while (l<=r) {
            if (s.charAt(l)!=s.charAt(r)) return false;
            l++;r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String a = sc.nextLine();
        System.out.println(isPalindrome(a));
    }
    
}
