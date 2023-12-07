public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};
        int n = arr.length;
        int m = n +1;
        long sum_natural = (m * (m +1))/2;
        int sum =0;
        for(int i =0 ; i< n; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Missing Number: " + (sum_natural - sum));
    }
}
