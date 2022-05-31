class Node {
    int val;
    Node next;
    Node (int val) {
        this.val = val;
    }
}

class Hell {
    static void traverse(Node head) {
        if(head == null) return;
        head = head.next;
        System.out.println(head.val);
        traverse(head);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next = b;
        b.next = c;
        
        traverse(a);

        System.out.println("hi");
    }
}