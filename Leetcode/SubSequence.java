import java.util.*;
public class SubSequence {

    private static void generate(char[] a , int idx , List<List<Character>> list, List<Character> ds ){

        if (idx == a.length) {
            list.add(new ArrayList(ds));
            return;
        }
        ds.add(a[idx]);
        generate(a, idx+1, list, ds);
        ds.remove(ds.size()-1);
        generate(a, idx+1, list, ds);
    }

    private static void generate(String s , String a ,  List<String> ds){
        if (s.length()==0) {
            ds.add(a);
            return;
        }
        generate(s.substring(1), a+s.charAt(0), ds);
        generate(s.substring(1), a, ds);
    }

    public static void main(String[] args) {
        char[] a = {'a','b','c'};
        List<List<Character>> list = new ArrayList<>();
        generate(a,0,list,new ArrayList<Character>());
        System.out.println(list);
        ArrayList<String> ds = new ArrayList<String>();
        generate("abc","",ds);
        System.out.println(ds);
    }
    
}
