import java.util.Stack;

public class BalancedParenthesis {
    
    // Method to check if parentheses are balanced
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        
        // Traverse each character in the expression
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            
            // Push opening brackets into stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // For closing brackets, check stack top
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;  // No matching opening bracket
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;  // Mismatched pair
                }
            }
        }
        
        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }
    
    // Helper method to check matching pairs
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
    
    // Main method
    public static void main(String[] args) {
        String expr1 = "{[()]}";
        String expr2 = "{[(])}";
        
        System.out.println(expr1 + " -> " + (isBalanced(expr1) ? "Balanced" : "Not Balanced"));
        System.out.println(expr2 + " -> " + (isBalanced(expr2) ? "Balanced" : "Not Balanced"));
    }
}