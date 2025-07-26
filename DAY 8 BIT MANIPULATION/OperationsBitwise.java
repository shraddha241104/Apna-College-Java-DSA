
import java.util.*;

public class OperationsBitwise {

    public static int GetIthBit(int number, int i) {
        int bitmask = (1 << i);
        if ((number & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int SetIthBit(int number, int i) {
        int bitmask = (1 << i);
        int setNum = number | bitmask;
        return setNum;
    }

    public static int ClearIthBit(int number, int i) {
        int bitmask = ~(1 << i);
        return number & bitmask;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(GetIthBit(number, i));
        System.out.println(SetIthBit(number, i));
        System.out.println(ClearIthBit(number, i));
    }
}
