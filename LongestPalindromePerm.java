import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestPalindromePerm {
    public static Boolean isPalindrome(String str)
    {
        Map<Character,Integer> map = new HashMap<>();
        int count =0;
        for(int i =0 ; i < str.length(); i++)
        {
            if (!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), 1);
            } else {
                map.put((str.charAt(i)), map.get(str.charAt(i)) + 1);
            }
        }
        for(Character ch : map.keySet())
        {
            if(map.get(ch) % 2 != 0)
            {
                count ++;
            }
        }
        if(count <=1)
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        System.out.println("Palindromic String: " + isPalindrome(str));

    }
}
