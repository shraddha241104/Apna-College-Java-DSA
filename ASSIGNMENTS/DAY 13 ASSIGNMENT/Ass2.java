
import java.util.*;

public class Ass2 {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (hm.get(num) == 1) {
                if (!hm.containsKey(num - 1) && !hm.containsKey(num + 1)) {
                    result.add(num);
                }
            }
        }
        return result;
    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        System.out.println(findLonely(nums));
    }
}
