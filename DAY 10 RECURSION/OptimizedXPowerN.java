
import java.util.*;

public class OptimizedXPowerN {

    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 == 0) {
            return halfPowerSq;
        } else {
            return x * halfPowerSq;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(optimizedPower(x, n));
    }
}
