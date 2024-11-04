public class C1{
    public static boolean isBalanced(String num) {
        int oSum = 0,eSum = 0;
        for(int i=0;i<num.length();i++){
            int temp = Integer.valueOf(num.charAt(i));

            if(i%2==0) eSum+=temp;
            else oSum+=temp;
        }
        System.out.println(eSum+" "+oSum);
        return eSum==oSum;
    }
    public static void main(String[] args) {
        String s = "1234";
        isBalanced(s);
    }
}
