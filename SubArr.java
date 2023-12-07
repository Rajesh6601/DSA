import java.util.Scanner;

public class SubArr {
    public static Boolean subArray(int []a, int []b, int n, int m) {
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
        int a[] = {2,3,0,5,1,1,2};
        int b[] = {3,0,5,1};
        int n = a.length;
        int m = b.length;
        System.out.println(subArray(a,b,n,m));
    }
}
