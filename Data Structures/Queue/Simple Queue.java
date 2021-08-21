class Queue {
    int front, back;
    static int max = 100;
    int arr[];

    Queue() {
        front = -1;
        back = -1;
        arr = new int[max];
    }

    void enqueue(int data) {
        if (front == -1)
            front++;

        if (back == max - 1) {
            System.out.println("Queue Overflowed");
            return;
        }

        arr[++back] = data;
    }
    
    void dequeue() {
        if (front == -1 || front > back) {
            System.out.println("Queue Underflowed");
            return;
        }

        front++;
    }
    
    void display() {
        for (int i = front; i <= back; i++) {
            System.out.println(arr[i]);
        }
    }
}

class RightVibe {
    public static void main(String args[]) {
        System.out.println("=========================================================\n");

        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.display();

        System.out.println("\n");
    }
}
