import java.util.*;
class RightVibe {
    static String s = "[c{b(a)}]";

    static boolean isBalanced() {
        Stack<Character> stack = new Stack<Character>();

        for (char ch : s.toCharArray()) {
            if("[{(".indexOf(ch) >= 0)
                stack.push(ch);
            else {
                char top = stack.peek();
                switch (ch) {
                    case ']': {
                        if (top == '(' || top == '{') {
                            return false;
                        }
                        stack.pop();
                        break;
                    }
                    case '}': {
                        if (top == '(' || top == '[') {
                            return false;
                        }
                        stack.pop();
                        break;
                    }
                    case ')': {
                        if (top == '[' || top == '{') {
                            return false;
                        }
                        stack.pop();
                        break;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println("=========================================================\n");

        System.out.print(isBalanced());
        
        System.out.println();
    }
}
