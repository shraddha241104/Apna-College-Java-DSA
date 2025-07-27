
import java.util.*;

public class SetBitsCount {

    public static int CountSetBits(int number) {
        int count = 0;
        while (number > 0) {
            if ((number & 1) != 0) {
                count++;
            }
            number = number >> 1;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(CountSetBits(number));
    }
}
