import java.util.ArrayList;
import java.util.List;

public class CommonElementWOMap {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50,60,70,80};
        int b[] = {20,25,80,90};
        int c[] = {20,80,100,200,300};
        List<Integer> list = new ArrayList<>();
        int i =0, j =0, k =0;
        int n1 = a.length, n2 = b.length, n3 = c.length;
        while(i < n1 && j < n2 && k < n3)
        {
            if(a[i] == b[j] && b[j] == c[k])
            {
                list.add(a[i]);
                i++;
                j++;
                k++;
            }
            else if (a[i] < b[j])
            {
                i++;
            }
            else if (b[j] < c[k])
            {
                j++;
            }
            else
                k++;
        }
        System.out.println("Common Elements: " +list);
    }
}
