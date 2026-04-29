import java.util.*;

public class InfixToPostfix {

    static int prec(char c) {
        return (c=='+'||c=='-')?1 : (c=='*'||c=='/')?2 : (c=='^')?3 : -1;
    }
    static boolean isRightAssoc(char c) { return c=='^'; }

    static String convert(String exp) {
        StringBuilder out = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (char c : exp.toCharArray()) {
            if (Character.isLetterOrDigit(c)) out.append(c);
            else if (c=='(') st.push(c);
            else if (c==')') {
                while (!st.isEmpty() && st.peek()!='(') out.append(st.pop());
                st.pop();
            } else {
                while (!st.isEmpty() && 
                      (prec(c)<prec(st.peek()) || 
                      (prec(c)==prec(st.peek()) && !isRightAssoc(c)))) 
                    out.append(st.pop());
                st.push(c);
            }
        }
        while (!st.isEmpty()) out.append(st.pop());
        return out.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String exp = sc.nextLine();
        System.out.println("Postfix: " + convert(exp));
    }
}