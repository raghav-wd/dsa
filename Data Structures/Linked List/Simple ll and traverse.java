class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class MyClass{
    static void traverse(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print("->"+curr.data);
            curr = curr.next;
        }
    }
    
    public static void main(String args[]){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        
        Node head = a;
        a.next = b;
        b.next = c;
        c.next = null;
        
        traverse(head);
    }
}
