import java.util.*;

class MinStack {
    Stack<Integer> stack;
    int min;

    public MinStack() {
        this.stack = new Stack<Integer>();
        min = 0;
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            min = val;
            return;
        }
        if (val < min) {
            stack.push(2 * val - min);
            min = val;
            return;
        }
        stack.push(val);
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        int popped = stack.pop();
        if (popped < min) {
            System.out.println(min);
            min = 2 * min - popped;
        } else
            System.out.println(popped);
    }

    public int getMin() {
        return min;
    }
}



class RightVibe {
    public static void main(String args[]) {
        System.out.println("=========================================================\n");

        MinStack minStack = new MinStack();
        minStack.push(8);
        minStack.push(10);
        minStack.push(6);
        minStack.push(3);
        minStack.push(7);
        System.out.println("Min: " + minStack.getMin());
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();

        System.out.println();
    }
}
