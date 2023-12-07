public class SortingSwapped {
    public static void sorted(int [] arr, int n)
    {
        int x =-1, y=-1;
        int prev = arr[0];
        for(int i =1; i < n; i++)
        {
            if(prev > arr[i])
            {
                if(x == -1)
                {
                    x = i -1;
                    y = i;
                }
                else
                {
                    y =i;
                }
            }
            prev = arr[i];
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
//        int [] arr = {1,2,4,3,5,6};
        int [] arr = {3,8,6,7,5,9,10};
        int n = arr.length;
        sorted(arr, n);
        for(int x : arr)
        {
            System.out.print(x + ",");
        }
    }
}
