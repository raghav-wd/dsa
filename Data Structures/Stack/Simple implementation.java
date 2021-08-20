class Stack {
    int top;
    int arr[];

    Stack() {
        top = -1;
        arr = new int[100];
    }

    void push(int n) {
        top++;
        if (top == 100 - 1) {
            System.out.println("Overflow");
            return;
        }
        arr[top] = n;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[top--];
    }

    void display() {
        int head = 0;
        while(true) {
            head = pop();
            if (head == -1)
                break;
            System.out.println(head);
        }
    }
}

class RightVibe {
    public static void main(String args[]) {
        System.out.println("=========================================================\n");

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();

        System.out.println("\n");
    }
}
