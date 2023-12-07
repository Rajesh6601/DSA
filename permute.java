import java.util.Arrays;
import java.util.*;

public class permute {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>(Arrays.asList(34,3,31,98,23));
       ArrayList<Integer> res = new ArrayList<>();
       Stack<Integer> input = new Stack<>();
       Stack<Integer> temp = new Stack<>();
       for(int x : list)
       {
           input.push(x);
       }
       while(!input.isEmpty())
       {
           int x = input.peek();
           input.pop();
           while(!temp.isEmpty() && temp.peek() > x)
           {
               input.push(temp.peek());
               temp.pop();
           }
           temp.push(x);
       }
       while(!temp.isEmpty())
       {
           input.push(temp.peek());
           temp.pop();
       }
       System.out.println(input);
    }
}
