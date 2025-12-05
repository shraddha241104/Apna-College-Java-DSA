
public class TreeDiameter {

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

    public static int treeHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = treeHeight(root.left);
        int rh = treeHeight(root.right);
        int height = (Math.max(lh, rh)) + 1;
        return height;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int lh = treeHeight(root.left);
        int rh = treeHeight(root.right);
        int selfDia = lh + rh + 1;
        return Math.max(Math.max(ld, rd), selfDia);
    }

    static class Info {

        int diameter;
        int height;

        public Info(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static Info diameter2(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);
        int diam = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height + rightInfo.height + 1);
        int ht = Math.max(leftInfo.height, rightInfo.height) + 1;
        return new Info(diam, ht);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int treeDiameter = diameter(root);
        System.out.println("Diameter of Tree : " + treeDiameter);
        Info treeDiameter2 = diameter2(root);
        System.out.println("Diameter of Tree : " + treeDiameter2.diameter);
    }
}
