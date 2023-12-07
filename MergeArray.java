public class MergeArray {
    public static void main(String[] args) {
        int num1[] = {1, 2, 3};
        int num2[] = {2, 5, 6};
        int m = num1.length;
        int n = num2.length;
        int i = m - 1, j = n - 1, k = (m + n) - 1;
        while (j >= 0) {
            if (i >= 0 && num1[i] > num2[j]) {
                num1[k--] = num1[i--];
            } else {
                num1[k--] = num2[j--];
            }
        }
       System.out.println("Length:" + num1.length);
    }
}
