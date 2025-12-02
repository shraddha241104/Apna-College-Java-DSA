
import java.util.*;

public class StackUsingDeque {

    static class Stack {

        Deque<Integer> dq = new LinkedList<>();
        //isEmpty

        public boolean isEmpty() {
            return dq.isEmpty();
        }
        //add

        public void push(int data) {
            dq.addLast(data);
        }
        //remove

        public int pop() {
            int data = dq.removeLast();
            return data;
        }
        //peek

        public int peek() {
            int data = dq.getLast();
            return data;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
