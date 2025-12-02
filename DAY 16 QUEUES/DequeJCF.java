
import java.util.*;

public class DequeJCF {

    public static void main(String args[]) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        System.out.println(deque);
        deque.addLast(2);
        deque.addLast(3);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }
}
