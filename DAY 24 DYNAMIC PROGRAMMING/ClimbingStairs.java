
import java.util.*;

public class ClimbingStairs {

    //recursive function
    public static int countWaysRec(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return countWaysRec(n - 1) + countWaysRec(n - 2);
    }

    //recursion + memoization function
    public static int countWaysMemoization(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) {
            return ways[n];
        }
        ways[n] = countWaysMemoization(n - 1, ways) + countWaysMemoization(n - 2, ways);
        return ways[n];
    }

    //tabulation
    public static int countWaysTabulation(int n) {
        int ways[] = new int[n + 1];
        ways[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                ways[i] = ways[i - 1] + 0;
            } else {
                ways[i] = ways[i - 1] + ways[i - 2];
            }
        }
        return ways[n];
    }

    public static void main(String args[]) {
        //recursion
        int n = 5;
        System.out.println(countWaysRec(n));
        //memoization
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(countWaysMemoization(n, ways));
        //tabulation
        System.out.println(countWaysTabulation(n));
    }
}
