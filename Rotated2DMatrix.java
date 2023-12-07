import java.util.Arrays;

public class Rotated2DMatrix {
    public static void rotatedArray(int arr[][])
    {
        int m = arr.length;
        int n = arr[0].length;
        // Step-1 Find the transpose of matrix
        for(int i =0 ; i <m ; i++)
        {
            for(int j =i ; j < n ; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //Step -2 Swap the columns
        for(int i =0 ; i < m ; i ++)
        {
            int li = 0;
            int ri = n -1;
            while(li < ri)
            {
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li ++;
                ri --;
            }
        }

        for(var mat : arr )
            System.out.println(Arrays.toString(mat));

    }
    public static void main(String[] args) {
        int arr[][] ={
                     {1, 2, 3, 4},
                     {5, 6, 7, 8},
                     {9, 10, 11, 12},
                     {13, 14, 15, 16}
                    };
        for(var mat : arr )
            System.out.println(Arrays.toString(mat));
        System.out.println("Transpose of Matrix..");
        rotatedArray(arr);

    }
}
