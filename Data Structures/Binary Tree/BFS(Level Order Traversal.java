import java.util.*;
class Node{
    int val; 
    Node left, right;
    Node(int val){
        this.val = val;
        left = right = null;
    }
    void printLevelOrder(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.print(temp.val+" ");
            if(temp.left != null) queue.add(temp.left);
            if(temp.right != null) queue.add(temp.right);
        }
    }
}

class MyClass{
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.printLevelOrder(root);
    }
}
