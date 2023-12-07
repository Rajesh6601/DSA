import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class PassingGame {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(23,0,2,0,39,28,19,0,0,0));
        for(int x : list)
        {
            if(!stack.isEmpty() && x == 0)
            {
                stack.pop();
            }
            else
            {
                stack.push(x);
            }
        }
        System.out.println(stack.peek());
    }
}
