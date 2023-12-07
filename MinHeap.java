import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        int nums[] = {7,4,6,1,3,2,5};
        int k =2;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums)
        {
            minHeap.add(num);
            if(minHeap.size() > k)
            {
                minHeap.remove();
            }
        }
        System.out.println("Kth = "+ k + " largest element: "+ minHeap.peek());

    }
}
