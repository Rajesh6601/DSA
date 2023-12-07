import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKElement {
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int k =2;
        int []arr = new int[k];
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < n ; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(b) - map.get(a);
            }
        });

        for(int i : map.keySet())
        {
            pq.add(i);
        }
        System.out.println(map);
        System.out.println(pq);

        for(int i =0 ;i < k; i++)
        {
            arr[i] = pq.poll();
        }

        for(int i : arr)
        {
            System.out.println(i);
        }
    }
}
