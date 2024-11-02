import java.util.Arrays;

class Solution {
    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
                System.out.println(Arrays.deepToString(dp));
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[text1.length()][text2.length()];
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println( longestCommonSubsequence(s1,s2));

    }
}
