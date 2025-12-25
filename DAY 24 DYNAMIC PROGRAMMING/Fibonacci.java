
public class Fibonacci {

    public static int getFib(int n, int fib[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (fib[n] != 0) {
            return fib[n];
        }
        fib[n] = getFib(n - 1, fib) + getFib(n - 2, fib);
        return fib[n];
    }

    public static int fibTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 5;
        int fib[] = new int[n + 1];
        int ans = getFib(n, fib);
        System.out.println(ans);
        System.out.println(fibTabulation(n));
    }
}
