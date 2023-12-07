import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestStrWithoutRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        int maxLength = 0, left = 0;
        Set<Character> charSet = new HashSet<>();
        for (int right = 0; right < str.length(); right++) {
            if (!charSet.contains(str.charAt(right))) {
                charSet.add(str.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(str.charAt(right))) {
                    charSet.remove(str.charAt(left));
                    left++;
                }
                charSet.add(str.charAt(right));
            }
        }
        System.out.println("MaxLength :" + maxLength);
    }
}
