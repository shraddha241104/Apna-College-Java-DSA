
import java.util.*;

public class XPowerN {

    public static int xPowern(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xpnm1 = xPowern(x, n - 1);
        int xpn = x * xpnm1;
        return xpn;
        // return x * xPowern(x,n-1) --> one line consized form
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(xPowern(x, n));
    }
}
