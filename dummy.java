import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class dummy {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,2,3,4,4,5,6,7,10));
       int B = 8;
       int ans =0;
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i =0 ;i < list.size(); i++)
       {
           if(map.containsKey(list.get(i)))
           {
               map.put(list.get(i), map.get(list.get(i))+1);
           }
           else
           {
               map.put(list.get(i),1);
           }
       }
       for(int i =0 ; i<list.size(); i++)
       {
           if(map.containsKey(B - list.get(i)))
           {
               ans = ans + map.get(B - list.get(i));
           }
       }
       System.out.println("Count :" + ans/2);

    }
}
