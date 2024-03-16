import java.util.ArrayDeque;
import java.util.Deque;

public class balancedpararenthesis {

    public static boolean checkpair(char val1 , char val2){

        return ((val1=='(') && val2 ==')')|| (val1 =='{' && val2 == '}') || (val1 == '[' && val2 == ']');
    }
    public static boolean checkbalancedpair(String expr){

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i<expr.length(); i++) {

            if (expr.charAt(i) == '(' || expr.charAt(i) == '{' || expr.charAt(i) == '[')

                stack.push(expr.charAt(i));

            else {
                char val = stack.peek();
            }
            if (stack.isEmpty())

                return false;
            else if (checkpair(stack.peek(), expr.charAt(i))) {
                stack.pop();
                continue;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        String expr = "{()}[]";

        String result;

        System.out.println(result = checkbalancedpair(expr)? "Balanced" : "NotBalanced");
    }
}