import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }

    void print(Node root) {
        if (root == null)
            return;
        print(root.left);
        System.out.println(root.val);
        print(root.right);
    }

    void bfs(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node popped = queue.poll();
            System.out.println(popped.val);
            if (popped.left != null)
                queue.add(popped.left);
            if (popped.right != null)
                queue.add(popped.right);
        }
    }
    
    // Note
    void invert(Node root) {
        if (root == null)
            return;
        Node tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invert(root.left);
        invert(root.right);
    }
}
class RightVibe {
    public static void main(String args[]) {
        System.out.println("=========================================================\n");

        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(1);

        root.invert(root);
        root.bfs(root);

        System.out.println();
    }
}

/*

        5
      4   3
    2   1

        5
      3   4
        1   2
*/
