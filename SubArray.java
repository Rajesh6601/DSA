import java.util.ArrayList;
import java.util.List;

public class SubArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int sum =0;
        List<List<Integer>> subarray1 = new ArrayList<>();
        for (int start = 0; start < A.length; start++) {
            for (int end = start; end < A.length; end++) {
                // Create a subarray from the start to end indices
                List<Integer> subarray = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subarray.add(A[i]);
                    sum += A[i];
                }
                subarray1.add(subarray);
            }
        }
        System.out.println(subarray1);
        System.out.println(sum);
    }
}


