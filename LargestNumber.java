import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
        Collections.sort(A, new Comparator<Integer>()
        {
            @Override
            public int compare(Integer a, Integer b) {
                return (String.valueOf(b) + String.valueOf(a)).compareTo(String.valueOf(a) + String.valueOf(b));
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int x : A)
        {
            sb.append(String.valueOf(x));
        }
        if(sb.charAt(0) == 0)
            System.out.println("0");
        System.out.println(sb.toString());
    }
}
