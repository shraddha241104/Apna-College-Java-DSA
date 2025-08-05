
import java.util.*;

public class Ass2 {

    public static void printDigits(int n) {
        String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        printDigits(n / 10);
        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDigits(n);
    }
}
