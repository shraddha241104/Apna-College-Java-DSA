
import java.util.*;

public class HashMapOpt {

    public static void main(String args[]) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();
        //insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 10);
        System.out.println(hm);
        //get - O(1)
        System.out.println(hm.get("India"));
        //containsKey - O(1)
        System.out.println(hm.containsKey("India"));
        //remove - O(1)
        hm.remove("US");
        System.out.println(hm);
        //size
        System.out.println(hm.size());
        //isEmpty
        System.out.println(hm.isEmpty());
        //clear
        // hm.clear();
        // System.out.println(hm.isEmpty());
        //iteration
        //hm.entrySet() - works same as Set returns pair
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("key=" + k + ",value=" + hm.get(k));
        }
    }
}
