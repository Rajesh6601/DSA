import java.util.PriorityQueue;

public class MinimizeSum {
    public static void main(String[] args) {
        int nums[] = {1,4,7,10};
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long ans = 0;
        for(long x : nums)
        {
            pq.add(x);
        }
        while(pq.size() > 1)
        {
            long a = pq.poll();
            long b = pq.poll();
            long sum = a + b;
            pq.add(sum);
            ans = ans + sum;
        }
        System.out.println("Answer :" +  ans);
    }
}
