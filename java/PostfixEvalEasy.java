import java.util.Stack;

public class PostfixEvalEasy {
    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // Skip spaces
            if (c == ' ') continue;

            // If operand, push to stack
            if (Character.isDigit(c)) {
                stack.push(c - '0');  // convert char to int
            } 
            // If operator, pop two operands
            else {
                int val2 = stack.pop();
                int val1 = stack.pop();

                switch (c) {
                    case '+': stack.push(val1 + val2); break;
                    case '-': stack.push(val1 - val2); break;
                    case '*': stack.push(val1 * val2); break;
                    case '/': stack.push(val1 / val2); break;
                }
            }
        }

        // Final answer
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "62 3 + -"; // Example (6 - (2+3))
        System.out.println("Result = " + evaluatePostfix(postfix));
    }
}