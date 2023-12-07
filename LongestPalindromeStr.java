import java.util.Arrays;

public class LongestPalindromeStr {
    public static void main(String[] args) {
        String str = "abcabbccd";
        int b = 3;
        int n = str.length();
        int freq[] = new int[26];
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            int index = ch - 'a';
            freq[index]++;
        }
        int total = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                total++;
            }
        }
        System.out.println(total);
        Arrays.sort(freq);
        int changes = 0;
        for(int i =0; i < 26; i++)
        {
            if(freq[i]!=0 && b-freq[i] >=0)
            {
                b = b - freq[i];
                changes++;
            }
        }
        System.out.println(total-changes);
        String st1= "raj";
        st1 = st1.concat(st1);
        System.out.println(st1);
    }
}
