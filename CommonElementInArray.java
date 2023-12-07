import java.util.HashMap;

public class CommonElementInArray {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60,70,80};
        int b[] = {20,25,80,90};
        int c[] = {20,80,100,200,300};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : a)
        {
            map.put(num ,map.getOrDefault(num,0)+1);
        }
        for(int num : b)
        {
            map.put(num ,map.getOrDefault(num,0)+1);
        }
        for(int num : c)
        {
            map.put(num ,map.getOrDefault(num,0)+1);
        }
        System.out.println("Map :" + map);
        for(Integer key : map.keySet())
        {
            if(map.get(key) == 3)
            {
                System.out.println(key);
            }
        }

    }
}
