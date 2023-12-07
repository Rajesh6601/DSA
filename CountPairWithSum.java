import java.util.*;
public class CountPairWithSum {
    public static int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int count =0;
        int left =0, right = n -1;
        while(left < right)
        {
            if(A.get(left) + A.get(right) == B)
            {
                count++;
            }
            else if(A.get(left) + A.get(right) <=B )
            {
                left++;
            }
            else {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,1,1));
        //[5,10,20,100,105]
//        arrayList.add(5);
//        arrayList.add(10);
//        arrayList.add(20);
//        arrayList.add(100);
//        arrayList.add(105);
        int count = solve(arrayList, 110);
        System.out.println("No. of pair :" + count);
    }
}
