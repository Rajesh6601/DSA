import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        for (Integer num : list) {
            set.add(num);
        }
        System.out.println(set);
        for (int num : set) {
            list1.add(num);
        }
        System.out.println("Non Duplicate:" + list1);
    }
}