import java.util.Stack;

public class BalanceParenthsesisStack {
    public static void main(String[] args) {
        String  A = "))))))))";
        Stack<Character> stack = new Stack<>();
        int flag =1;
        for(Character ch : A.toCharArray())
        {
            if(!stack.isEmpty() && (ch == ')' || ch == '}' || ch == ']'))
            {
                stack.pop();
            }
            else if(stack.isEmpty() && (ch == ')' || ch == '}' || ch == ']'))
            {
                break;
            }
            else
            {
                stack.push(ch);
            }
        }
        System.out.println(stack);
        if(stack.isEmpty())
        {
            flag =1;
        }
        else
        {
            System.out.println("Not a Balanced Parenthesis");
        }
    }
}
