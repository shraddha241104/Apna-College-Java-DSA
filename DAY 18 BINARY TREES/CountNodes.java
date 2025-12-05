
public class CountNodes {

    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int nodesCount(Node root) {
        if (root == null) {
            return 0;
        }
        int lc = nodesCount(root.left);
        int rc = nodesCount(root.right);
        return lc + rc + 1;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int count = nodesCount(root);
        System.out.println("Count of Nodes of Tree : " + count);
    }
}
