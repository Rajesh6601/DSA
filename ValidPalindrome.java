import java.util.Scanner;

public class ValidPalindrome {
    public static Boolean isPalindrome(String str)
    {
        int left =0, right = str.length()-1;
        while(left< right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        System.out.println("Palindrome: " + isPalindrome(str));

    }
}
