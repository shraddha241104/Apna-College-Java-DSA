
import java.util.*;

public class QueueJCF {

    public static void main(String args[]) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }

        q2.add(1);
        q2.add(2);
        q2.add(3);
        while (!q2.isEmpty()) {
            System.out.println(q2.peek());
            q2.remove();
        }
    }
}
