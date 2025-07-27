
import java.util.*;

public class FastExponentiation {

    public static int CalcPower(int number, int power) {
        int ans = 1;
        while (power > 0) {
            if ((power & 1) != 0) {
                ans = number * ans;
            }
            number = number * number;
            power = power >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(CalcPower(number, power));
    }
}
