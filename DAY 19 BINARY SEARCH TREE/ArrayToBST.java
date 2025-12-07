
public class ArrayToBST {

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

    public static Node creation(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = creation(arr, start, mid - 1);
        root.right = creation(arr, mid + 1, end);
        return root;
    }

    public static void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void main(String args[]) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};
        Node root = creation(arr, 0, arr.length - 1);
        inorderTraversal(root);
    }
}
