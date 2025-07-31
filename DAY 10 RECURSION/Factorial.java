
import java.util.*;

public class Factorial {

    public static int factorialNum(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = factorialNum(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorialNum(n));
    }
}
