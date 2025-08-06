
import java.util.*;

public class Ass3 {

    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(length(str));
    }
}
