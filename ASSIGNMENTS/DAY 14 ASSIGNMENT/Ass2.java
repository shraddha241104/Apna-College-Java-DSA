
public class Ass2 {

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node push(int data, Node head) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static Node skipMDeleteN(Node head, int M, int N) {
        if (M == 0 || head == null) {
            return null;
        }
        Node curr = head;
        while (curr != null) {
            for (int i = 1; i < M && curr != null; i++) {
                curr = curr.next;
            }
            if (curr == null) {
                break;
            }
            Node temp = curr.next;
            for (int i = 0; i < N && temp != null; i++) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = temp;
        }
        return head;
    }

    public static void main(String args[]) {
        Node head = null;
        int M = 2;
        int N = 3;
        head = push(10, head);
        head = push(9, head);
        head = push(8, head);
        head = push(7, head);
        head = push(6, head);
        head = push(5, head);
        head = push(4, head);
        head = push(3, head);
        head = push(2, head);
        head = push(1, head);
        System.out.printf("M = %d, N = %d \nLinked list we have is :\n", M, N);
        printList(head);

        skipMDeleteN(head, M, N);

        System.out.printf("\nLinked list on deletion is :\n");
        printList(head);
    }
}
