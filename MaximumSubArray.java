public class MaximumSubArray {
    public static void main(String[] args) {
        int []nums = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = Integer.MIN_VALUE;
        for(int i =0; i < nums.length; i++)
        {
            int currSum =0;
            for(int j = i; j < nums.length; j++)
            {
                currSum+= nums[j];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("Max Value for subArray: "+ maxSum);
    }
}
