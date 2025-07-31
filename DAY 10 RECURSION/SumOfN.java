
import java.util.*;

public class SumOfN {

    public static int sumOfN(int n) {
        int sum;
        if (n == 1) {
            return 1;
        }
        sum = n + sumOfN(n - 1);
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfN(n));
    }
}
