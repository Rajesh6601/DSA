import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConsecutiveELements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 2, 6, 4, 5));
        Collections.sort(list);
        System.out.println("No:" + list.get(list.size()-1));
        int flag =1;
        int prev = list.get(0);
        for(int i =1; i < list.size(); i++)
        {
            if(prev+1 != list.get(i))
            {
                flag =0;
            }
            prev = list.get(i);
        }
        System.out.println(flag);
    }
}
