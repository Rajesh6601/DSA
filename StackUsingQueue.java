import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int data)
    {
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.poll();
        }
        q1.add(data);
        while(!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }
    }

    public int pop()
    {
        int ele;
        if(q1.isEmpty() && q2.isEmpty())
        {
            System.out.println("Stack underflow..");
            System.exit(0);
        }
        ele = q1.peek();
        q1.poll();
        return ele;
    }

    public static void main(String[] args) {
        StackUsingQueue st = new StackUsingQueue();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
