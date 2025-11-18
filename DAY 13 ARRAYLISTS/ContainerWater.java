
import java.util.*;

public class ContainerWater {

    public static int maxWater(ArrayList<Integer> heights) {
        int maxStoredWater = 0;
        for (int i = 0; i < heights.size(); i++) {
            for (int j = i + 1; j < heights.size(); j++) {
                int ht = Math.min(heights.get(i), heights.get(j));
                int width = j - i;
                int currWater = ht * width;
                if (currWater > maxStoredWater) {
                    maxStoredWater = currWater;
                }
            }
        }
        return maxStoredWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(2);
        heights.add(7);
        System.out.println("Maximum water stored by the container is : " + maxWater(heights));
    }
}
