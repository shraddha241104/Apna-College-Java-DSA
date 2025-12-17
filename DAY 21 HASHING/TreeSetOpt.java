
import java.util.*;

public class TreeSetOpt {

    public static void main(String args[]) {
        TreeSet<String> cities = new TreeSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Kolakata");
        System.out.println(cities);
        //rest all other operations are same as HashSet, LinkedHashSet but with Time Complexity O(log n)
    }
}
