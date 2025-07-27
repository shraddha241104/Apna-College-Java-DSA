
import java.util.*;

public class PowerOf2 {

    public static boolean PowOf2(int number) {
        return (number & number - 1) == 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (PowOf2(number)) {
            System.out.println(number + " is power of 2");
        } else {
            System.out.println(number + " is not power of 2");
        }
    }
}
