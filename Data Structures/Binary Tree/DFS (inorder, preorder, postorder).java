import java.util.*;
class Node {
    int val;
    Node left = null, right = null;

    Node(int val) {
        this.val = val;
    }
    
    void preOrder(Node node){
        if(node == null){
            return;
        }
        
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }
  
    void postOrder(Node head) {
        if (head == null) {
            return;
        }
        postOrder(head.left);
        postOrder(head.right);
        System.out.println(head.val);
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

        root.postOrder(root);

        System.out.println("\n");
    }
}
