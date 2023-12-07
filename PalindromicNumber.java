public class PalindromicNumber {
    public static void main(String[] args) {
//        int a[] = {1,2,3,2,2};
        int num = 122;
        String str = String.valueOf(num);
        int n = str.length();
        Boolean flag = true;
        for(int i =0; i < n/2; i++)
        {
            if(str.charAt(i) != str.charAt(n-i-1))
            {
                flag = false;
                System.out.println("Not a palindromic number");
                break;
            }
        }
        if (flag)
            System.out.println("Palindromic Array");
    }
}
