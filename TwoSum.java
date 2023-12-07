import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=-0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            map.put(arr[i], i);
        }
        System.out.println("Map :"+ map);
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int result[] = new int[2];
        for(int i =0;i < n; i++)
        {
            if (arr[i] ==  target && map.containsKey(0))
            {
                result[0] = map.get(arr[i]);
                result[1] = 0;
                break;
            }
            else if(map.containsKey(target - arr[i]))
            {
                if(map.get(target - arr[i]) > i)
                {
                    result[0] = map.get(arr[i]);
                    result[1] = map.get(target-arr[i]);
                    break;
                }
            }
        }
        System.out.println("Result is ["+ result[0] + "," + result[1]+ "]");
    }

}
