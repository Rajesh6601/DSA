public class CountNegInSortedMatrix {
    public static int binarySearch(int[][] nums)
    {
        int n = nums[0].length;
        int count =0;
        for(int[] row : nums) {
            int low = 0, high = n-1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (row[mid] < 0) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
                count += n - low;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [][] grid = {{4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}};
        System.out.println("Total negative number:" + binarySearch(grid));
    }
}
