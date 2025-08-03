
import java.util.*;

public class BinaryString {

    public static void printBinaryString(int n, int lastPlace, String sb) {
        //base case
        if (n == 0) {
            System.out.println(sb);
            return;
        }
        printBinaryString(n - 1, 0, sb + "0");
        if (lastPlace == 0) {
            printBinaryString(n - 1, 1, sb + "1");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printBinaryString(n, 0, "");
    }
}
