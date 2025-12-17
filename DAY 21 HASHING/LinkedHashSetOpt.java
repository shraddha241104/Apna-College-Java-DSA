
import java.util.*;

public class LinkedHashSetOpt {

    public static void main(String args[]) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Mumbai");
        cities.add("Kolkata");
        System.out.println(cities);
        cities.remove("Delhi");
        System.out.println(cities);
    }
}
