import java.util.ArrayList;
import java.util.List;

public class D {
    public static void main(String[] args) {
        ArrayList<String> s =(ArrayList)new Solution().generateParenthesis(3);
       System.out.println(s);

    }
}
class Solution {
    private void generate(char[] ch , int n , int i , int o , int c , List<String> ds){
        if(i==ch.length) {
            String s = new String(ch);
            ds.add(s);
            return;
        }
        if(o<n){
            ch[i]='(';
            generate(ch,n,i+1,o+1,c,ds);
        }
        if(c<o){
            ch[i]=')';
            generate(ch,n,i+1,o,c+1,ds);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ds = new ArrayList<String>();
        char[] ch = new char[n*2];
        generate(ch,n,0,0,0,ds);
        return ds;
    }
}