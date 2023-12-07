import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;

public class CerealBox {
    public static void main(String[] args) {
        int arr[] ={100,15};
        int n =2;
        int k = 10;
        PriorityQueue<Float> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : arr)
        {
            pq.add((float)(x));
        }
        for(int i =1 ; i <= n; i++)
        {
            while(!pq.isEmpty())
            {
                double temp = pq.poll();
                temp-= (float)Math.max(temp/10, k);
                if (temp > 0)
                {
                    pq.add((float)temp);
                }
            }
        }
        float sum =0;
        while(!pq.isEmpty())
        {
            sum+=pq.poll();
        }
        System.out.println(pq);
        System.out.println("Cereal Box sum : "+ (long)sum);
    }
}
