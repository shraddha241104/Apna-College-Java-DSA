
import java.util.*;

public class FractionalKnapsack {

    public static void main(String args[]) {
        int values[] = {60, 100, 120};
        int weights[] = {10, 20, 30};
        int ratio[] = new int[values.length];
        for (int i = 0; i < ratio.length; i++) {
            ratio[i] = values[i] / weights[i];
        }
        int knapsack[][] = new int[values.length][3];
        for (int i = 0; i < values.length; i++) {
            knapsack[i][0] = values[i];
            knapsack[i][1] = weights[i];
            knapsack[i][2] = ratio[i];
        }
        Arrays.sort(knapsack, Comparator.comparingDouble(o -> o[2]));
        int size = ratio.length;
        int capacity = 50;
        int value = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (capacity >= knapsack[i][1]) {
                capacity = capacity - knapsack[i][1];
                value = value + knapsack[i][0];
            } else {
                value = value + (knapsack[i][2] * capacity);
                break;
            }
        }
        System.out.println("Fractional Knapsack value = " + value);
    }
}
