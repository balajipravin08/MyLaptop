import java.sql.ResultSet;
import java.sql.SQLException;

public class PrintSubsequence {
    public static String store(String s1 , String s2,int[][] dp){
        int i=s1.length();
        int j=s2.length();
        String sb = "";
        while(i>0&&j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                 sb=s1.charAt(i-1)+sb;
                i--;
                j--;
            } else if (dp[i-1][j]>dp[i][j-1]) {
                i--;
            }else {
                j--;
            }
        }
        return sb;
    }

    public static String generate(String s1 , String s2,int[][] dp){
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length() ; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return store(s1,s2,dp);
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        System.out.println(generate(s1,s2,dp));
    }
}

