
import java.util.*;

public class ArrayBasics {

    public static void main(String args[]) {
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println(marks.length);
    }
}
