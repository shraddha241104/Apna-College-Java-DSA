
import java.util.*;

public class Ass4 {

    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        while (result.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int x : result) {
                if (2 * x - 1 <= n) {
                    temp.add(2 * x - 1);
                }
            }
            for (int x : result) {
                if (2 * x <= n) {
                    temp.add(2 * x);
                }
            }
            result = temp;
        }
        return result;
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println(beautifulArray(n));
    }
}
