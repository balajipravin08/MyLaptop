import java.util.Arrays;

class Demo {
    public static String clearStars(String s) {
        StringBuilder sb = new StringBuilder(s);
        int[] ch = new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!='*'){
                ch[c-'a']=i+1;
                System.out.println(Arrays.toString(ch));

            }else{
                for(int j=0;j<ch.length;i++){
                    if(ch[j]!=0){
                        System.out.println(ch[j]);
                        sb.deleteCharAt((ch[j]-1));
                        sb.deleteCharAt(i-1);
                        System.out.println(sb);
                        break;
                    }
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        clearStars("aaba*");
    }
}