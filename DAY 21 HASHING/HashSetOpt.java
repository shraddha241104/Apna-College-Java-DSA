
import java.util.*;

public class HashSetOpt {

    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        System.out.println(set);
        if (set.contains(2)) {
            System.out.println("Set contains 2");
        }
        System.out.println(set.size());
        set.remove(2);
        System.out.println(set.contains(2));
        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set);
    }
}
