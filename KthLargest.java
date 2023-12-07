import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int arr[] = {3,2,1};
        int k =2;
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i < n; i++)
        {
            int sum =0;
            for(int j = i; j < n ; j++)
            {
                sum = sum + arr[j];
                pq.add(sum);
            }
            if(pq.size() > k)
            {
                System.out.println("Before:" + pq);
                pq.remove();
                System.out.println("After " + pq);
            }
        }
        System.out.println(pq);
    }
}
