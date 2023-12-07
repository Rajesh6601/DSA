import java.util.Arrays;

public class Anagram {

    public static boolean areAnagrams(String str1, String str2) {
       str1 = str1.replaceAll("\\s", "").toLowerCase();
       str2 = str2.replaceAll("\\s", "").toLowerCase();

       if(str1.length() != str2.length())
           return false;

       char[] ch1 = str1.toCharArray();
       char[] ch2 = str2.toCharArray();

       Arrays.sort(ch1);
       Arrays.sort(ch2);

       return Arrays.equals(ch1,ch2);
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        if (areAnagrams(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagrams.");
        }
    }
}
