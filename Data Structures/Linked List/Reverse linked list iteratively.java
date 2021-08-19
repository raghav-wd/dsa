class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    void traverse(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print("->" + curr.data);
            curr = curr.next;
        }
    }

    Node reverse(Node head) {
        Node curr = head, 
        prev = null, next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}

class RightVibe {
    public static void main(String args[]) {
        System.out.println("=========================================================\n");

        Node n1 = new Node(5);
        Node n2 = new Node(7);
        Node n3 = new Node(2);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        // head.traverse(head);
        head =head.reverse(head);
        head.traverse(head);

        System.out.println("\n");
    }
}
