class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }

    boolean isBstUtil(Node head, int min, int max) {
        if (head == null)
            return true;

        if (head.val < min || head.val > max)
            return false;

        return (isBstUtil(head.left, min, head.val - 1) && isBstUtil(head.right, head.val + 1, max));
    }
    
    boolean isBST(Node head)  {
        return isBstUtil(head, Integer.MIN_VALUE,
                               Integer.MAX_VALUE);
    }
}

class RightVibe {
    public static void main(String args[]) {
        System.out.println("=========================================================\n");
		
        Node tree = new Node(4);
        tree.left = new Node(2);
        tree.right = new Node(5);
        tree.left.left = new Node(1);
        tree.left.right = new Node(3);
 
        if (tree.isBST(tree))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");

        System.out.println();
    }
}
