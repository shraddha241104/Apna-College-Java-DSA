
import java.util.*;

public class FriendsPairing {

    public static int countWays(int n) {
        //base case
        if (n == 1 || n == 2) {
            return n;
        }
        int single = countWays(n - 1);
        int pair = (n - 1) * countWays(n - 2);
        int totalWays = single + pair;
        return totalWays;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countWays(n));
    }
}
