public class BuildHeap1 {

    public static void heapify(int[] arr, int n , int i)
    {
        int largest = i;
        int leftIndx = 2*i+1;
        int rightIndx = 2*i+2;

        if(leftIndx <n && arr[leftIndx] > arr[largest])
        {
            largest = leftIndx;
        }
        if(rightIndx <n && arr[rightIndx] > arr[largest])
        {
            largest = rightIndx;
        }
        if(largest!=i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }

    public static void displayHeap(int[] arr)
    {
        for(int i =0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void buildHeap(int[] arr, int n)
    {
        int startIndx = n/2 -1;
        for(int i = startIndx; i>=0 ; i--)
        {
            heapify(arr, n, i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int n = arr.length;

        // function calling
        buildHeap(arr, n);
        displayHeap(arr);
    }
}
