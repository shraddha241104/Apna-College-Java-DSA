
import java.util.*;

public class Fibonacci {

    public static int calcFibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = calcFibo(n - 1);
        int fnm2 = calcFibo(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calcFibo(n));
    }
}
