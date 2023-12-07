public class MinimumSortedArray {
    public static int binarySearch(int [] nums, int n) {
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (mid >= 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if (nums[low] <= nums[mid] && nums[mid] > nums[high])
            {
                low = mid +1;
            }
            else
            {
                high = mid -1;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int []arr = {4,5,6,7,0,1,2};
        int n = arr.length;
        System.out.println(binarySearch(arr,n));

    }
}
