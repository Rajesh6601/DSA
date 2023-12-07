public class PalindromeRecursion {
    public static Boolean isPalindrome(String str)
    {
      if(str.length() <=1)
      {
          return true;
      }
      else
      {
          char firstChar = str.charAt(0);
          char lastChar = str.charAt(str.length() -1);
          if(firstChar == lastChar)
          {
              String subStr = str.substring(1, str.length()-1);
              return isPalindrome(subStr);
          }
          else {
              return false;
          }
      }

    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("Plaindromic String: " + isPalindrome(str));
    }
}
