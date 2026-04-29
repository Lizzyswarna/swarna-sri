import java.util.Stack;

public class ReverseStackEasy {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Original stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        // Create another stack
        Stack<Integer> reversed = new Stack<>();

        // Pop from original and push into new stack
        while (!stack.isEmpty()) {
            reversed.push(stack.pop());
        }

        System.out.println("Reversed Stack: " + reversed);
    }
}