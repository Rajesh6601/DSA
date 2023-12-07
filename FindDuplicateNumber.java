import java.util.Scanner;

public class FindDuplicateNumber {
    public static int duplicateNumber(int[] nums)
    {
       int slow = nums[0];
       int fast = nums[0];
       while(true)
       {
           slow = nums[slow];
           fast = nums[nums[fast]];
           if(slow == fast)
           {
               break;
           }
       }
       slow = nums[0];
       while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }
       return fast;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the num array:");
        Integer num = sc.nextInt();
        int[] nums = new int[num];
        for(int i=0; i < num; i ++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Duplicate Number : " + duplicateNumber(nums));
    }
}
