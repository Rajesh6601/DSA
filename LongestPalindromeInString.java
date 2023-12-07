public class LongestPalindromeInString {
    public static String findLargestPalindrome(String str) {
        int maxLength=0;
        String longestPalindrome  = "";
        for(int i =0 ; i<str.length(); i++)
        {
            String palindrome1 = outerCheck(str, i, i);
            if (palindrome1.length() > maxLength)
            {
                maxLength = palindrome1.length();
                longestPalindrome = palindrome1;
            }
            String palindrome2 = outerCheck(str, i, i+1);
            if(palindrome2.length() >  maxLength)
            {
                maxLength= palindrome2.length();
                longestPalindrome = palindrome2;
            }
        }
        return longestPalindrome;

    }

    public static String outerCheck(String str, int left, int right)
    {
        while(left >=0 && right < str.length() && str.charAt(left) == str.charAt(right))
        {
            left --;
            right++;
        }
        return str.substring(left+1, right);
    }

    public static void main(String[] args) {
        String input = "bababd";
        String largestPalindrome = findLargestPalindrome(input);
        System.out.println("The largest palindrome in the string is: " + largestPalindrome);
    }
}
