
import java.util.*;

public class Ass3 {

    public static int mostFrequent(ArrayList<Integer> al, int key) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < al.size() - 1; i++) {
            if (al.get(i) == key) {
                countMap.put(al.get(i + 1), countMap.getOrDefault(al.get(i + 1), 0) + 1);
            }
        }
        int maxCount = 0;
        int result = -1;
        for (int target : countMap.keySet()) {
            if (maxCount < countMap.get(target)) {
                maxCount = countMap.get(target);
                result = target;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(100);
        al.add(200);
        al.add(1);
        al.add(100);
        System.out.println(mostFrequent(al, 1));
    }
}
