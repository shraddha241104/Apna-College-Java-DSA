
import java.util.*;

public class Ass5 {

    public static void towersOfHanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towersOfHanoi(n - 1, src, dest, help);
        System.out.println("transfer disk " + n + " from " + src + " to " + help);
        towersOfHanoi(n - 1, help, src, dest);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towersOfHanoi(n, "A", "B", "C");
    }
}
