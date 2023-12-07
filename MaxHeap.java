import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k =2;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums)
        {
            maxHeap.add(num);
        }
        for(int i =0; i < k-1; i++)
        {
            maxHeap.remove();
        }
        System.out.println("K = " + k + " Largest element: "+ maxHeap.peek());
    }
}
