public class NegativePositiveNunmber {
    public static void main(String[] args) {
//        int [] arr = {19, -20, 7, -4, -13, 11, -5, 3};
        int [] arr = {7, -3, 2, 8, -4, 11, -6};
        int n = arr.length;
        int p =0;
        for(int i = 0 ; i < n; i++ )
        {
            if(arr[i] < 0)
            {
                int temp = arr[p];
                arr[p] = arr[i];
                arr[i] = temp;
                p++;
            }
        }
        for(int x: arr)
        {
            System.out.print(x + ",");
        }
    }
}
