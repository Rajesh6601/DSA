import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberInArray {
    public static void main(String[] args) {
        int[] nums = {10,20,20,30,40,50,50};
        int num =0 ;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0 ; i< nums.length; i++)
        {
           if(!map.containsKey(nums[i]))
           {
               map.put(nums[i], 1);
           }
           else
           {
               map.put(nums[i], map.getOrDefault(nums[i],0) +1);
           }
        }
        System.out.println("Map : "+ map);
        for(Map.Entry<Integer,Integer> input : map.entrySet())
        {
            if(input.getValue() > 1)
            {
                num = input.getKey();
                System.out.println("Duplicate Number : "+ num);
            }
        }
//        System.out.println("Duplicate Number : "+ num);
    }
}
