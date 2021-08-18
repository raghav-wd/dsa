class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val = val;
        this.left = this.right = null;
    }
    public void preOrder(Node node){
        if(node == null){
            return;
        }
        
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
}

class Kjd {
 public static void main(String args[]) {
      Node root = new Node(5);
      root.left = new Node(3);
      root.right = new Node(2);
      
      root.preOrder(root);
    }   
}
