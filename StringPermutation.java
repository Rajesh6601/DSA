import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    static List<String> lst;
    public static List<String> findPermutation(String str)
    {
        lst = new ArrayList<String>();
        permutation(str.toCharArray(), 0 );
        return lst;
    }
    public static void permutation(char[] c, int fi)
    {
        if(fi == c.length-1)
        {
            lst.add(new String(c));
            return;
        }
        for(int i = fi; i < c.length; i++)
        {
            swap(c, fi, i);
            permutation(c, fi+1);
            swap(c,fi,i);
        }
    }

    public static void swap(char[] str, int x, int y)
    {
        char temp = str[x];
        str[x] = str[y];
        str[y] = temp;
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(findPermutation(str));
    }
}
