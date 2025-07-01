
import java.util.*;

public class RelationalOperators {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of first operand: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of second operand: ");
        int b = sc.nextInt();
        //returns true or false
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        sc.close();
    }

}
