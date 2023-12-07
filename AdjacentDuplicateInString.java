import java.util.Stack;

public class AdjacentDuplicateInString {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "abbaca";
        String sb = "";
        for(int i =0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (stack.isEmpty() || stack.peek() != ch)
            {
                stack.push(ch);
            }
            else
            {
                stack.pop();
            }
        }
        while(!stack.isEmpty())
        {
            sb = stack.pop() + sb;
            System.out.println(sb);
        }
        System.out.println("New String:"+ sb);
    }
}
