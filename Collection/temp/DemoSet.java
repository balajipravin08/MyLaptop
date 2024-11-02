import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoSet {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        
    
        System.out.println(set.subSet(0,50));
    }
}

