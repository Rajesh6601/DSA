

import java.util.Scanner;

public class subStringArray {
    public static Boolean subArray(char []a, char []b, int n, int m) {
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (a[i + j] != b[j]) {
                    break;
                }
            }
            if (j == m) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String a = "rajesh";
        char [] ch1 = a.toCharArray();
        String b = "jes";
        char [] ch2 = b.toCharArray();
        int n = a.length();
        int m = b.length();
        System.out.println(subArray(ch1,ch2,n,m));
    }
}
