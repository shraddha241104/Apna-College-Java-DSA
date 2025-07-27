
import java.util.*;

public class Ass2 {

    public static void swapNumbers(int a, int b) {
        System.out.println("Before swapping the numbers are a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping the numbers are a = " + a + " b = " + b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swapNumbers(a, b);
    }

}
