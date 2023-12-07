import java.util.ArrayList;

public class SumOfSubset {
    public static ArrayList<Integer> sumOfSubset(ArrayList<Integer> arr, int N)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        function(arr, ans, 0, 0, N);
        return ans;
    }
    public static void function(ArrayList<Integer> arr, ArrayList<Integer> ans, int idx, int sum, int N)
    {
        if(idx == N)
        {
            ans.add(sum);
            return;
        }
        function(arr,ans,idx+1,sum+arr.get(idx),N);
        function(arr,ans,idx+1,sum,N);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        int N = arr.size();
        System.out.println(sumOfSubset(arr,N));
    }
}
