public class BinarySearch {
    public static Integer binarySerach(int[] nums, int target)
    {
        int low= 0, high = nums.length-1;
        int mid =0;
        while(low <= high)
        {
            mid = low + (high - low) /2;
            if (nums[mid] == target)
            {
                return mid;
            }
            if (nums[mid] > target)
            {
                high = mid -1;
            }
            if (nums[mid] < target)
            {
                low = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {10,20,30,40,50};
        int target = 10;
        System.out.println("Target Element found at "+ binarySerach(nums, target));

    }
}
