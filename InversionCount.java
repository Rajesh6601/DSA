public class InversionCount {
    public static void main(String[] args) {
        int [] A = {3, 4, 1, 2};
        int n = A.length;
        int curr = A[0];
        int count =0;
        for(int i =1; i<n; i++)
        {
            if(curr > A[i])
            {
                count++;
            }
            else
            {
                curr = A[i];
            }
        }
        System.out.println(count);
    }
}
