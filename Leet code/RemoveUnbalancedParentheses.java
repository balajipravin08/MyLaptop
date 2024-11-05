import java.util.Scanner;

public class RemoveUnbalancedParentheses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input string
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        removeUnbalancedParentheses(str);

        // Print the new string after removing unbalanced parentheses
        System.out.println("New string is: " + str);
    }

    // Function to remove unbalanced parentheses
    public static void removeUnbalancedParentheses(String s) {
        int open = 0 , close = 0;
        char[] ch = s.toCharArray();
        for (int i = 0 , j = ch.length-1; i < ch.length; i++,j--) {
            if (ch[i]=='(') {
                open++;
            }else if(ch[i]==')'){
                open--;
            }

            if (ch[j] == ')') {
                close++;
            }
            else if (ch[j]=='(') {
                close--;
            }

            if(open<0){
                ch[i] = '.';
                open=0;
            }
            if (close<0) {
                ch[j] = '.';
                close=0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]!='.') {
                sb.append(ch[i]);
            }
        }
        s = sb.toString();
        System.out.println(s);
    }
}
