import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer>  A = new ArrayList<>(Arrays.asList(10, 6, 4, 7, 9)) ;
        for (int i = 0; i < 3; i++) {
            // finding the minimum element from the remaining array
            int minn = Integer.MAX_VALUE, idx = 0;
            for (int j = i; j < A.size(); j++) {
                if (A.get(j) < minn) {
                    minn = A.get(j);
                    idx = j;
                }
            }
            int tmp = A.get(i);
            A.set(i,A.get(idx));
            A.set(idx, tmp);
        }
        System.out.println(A);
//        int n = A.size();
//        for(int i =0 ; i < n-1; i++)
//        {
//            for(int j =0 ; j< n-i-1; j++)
//            {
//                if(A.get(j) > A.get(j+1))
//                {
//                    int temp = A.get(j);
//                    A.set(j, A.get(j+1));
//                    A.set(j+1, temp);
//                }
//
//            }
//        }
//        System.out.println(A);

    }
}
