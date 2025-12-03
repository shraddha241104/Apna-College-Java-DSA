
import java.util.*;

public class IndianCoins {

    public static void main(String args[]) {
        Integer denominations[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        Arrays.sort(denominations, Comparator.reverseOrder());
        int size = denominations.length;
        int count = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (denominations[i] <= amount) {
                while (denominations[i] <= amount) {
                    count++;
                    amount -= denominations[i];
                    ans.add(denominations[i]);
                }
            }
        }
        System.out.println("Minimum Number of coins/Notes required to change : " + count);
        System.out.println(ans);
    }
}
