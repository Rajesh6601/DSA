import java.util.Stack;

import static java.lang.System.exit;

public class QueueUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int data)
    {
        stack1.push((data));
    }

    public int dequeue()
    {
        int ele;
        if(stack1.isEmpty() && stack2.isEmpty())
        {
            System.out.println("Stack1 and Stack2 are empty");
            System.exit(0);
        }
        if(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
            {
                ele = stack1.pop();
                stack2.push(ele);
            }
        }
        ele = stack2.pop();
        return ele;
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
