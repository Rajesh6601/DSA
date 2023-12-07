import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("abcdefgh", "aefghijk", "abcefgh"));

        int n = list.size();
        System.out.println(n);
        int min = Integer.MAX_VALUE;
        for(int i =0 ; i<n; i++)
        {
            min = Math.min(min, list.get(i).length());
        }
        System.out.println(min);
        String res = "";
        if (list.size() == 0)
            res = "";
        for(int i =0; i<min; i++)
        {
            char ch = list.get(0).charAt(i);
            for(int j =1; j < n; j++)
            {
                if(ch != list.get(j).charAt(i))
                {
                    res = "";
                }
            }
            res += ch;
        }
        System.out.println(res);
    }
}
