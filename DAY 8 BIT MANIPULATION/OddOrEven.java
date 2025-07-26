
import java.util.*;

public class OddOrEven {

    public static boolean checkOddOrEven(int number) {
        int bitmask = 1;
        if ((number & bitmask) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (checkOddOrEven(number)) {
            System.out.println(number + " is a even number");
        } else {
            System.out.println(number + " is a odd number");
        }
    }
}
