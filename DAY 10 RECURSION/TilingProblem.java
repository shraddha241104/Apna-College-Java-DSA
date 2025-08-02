
import java.util.*;

public class TilingProblem {

    public static int tilingProblem(int n) {
        //base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // recursive calls
        int fnm1 = tilingProblem(n - 1);
        int fnm2 = tilingProblem(n - 2);
        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tilingProblem(n));
    }
}
