
import java.util.*;

public class IncreasingNumbers {

    public static void printNumber(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printNumber(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumber(n);
    }
}
