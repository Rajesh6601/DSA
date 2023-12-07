public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int target =2;
        int low = 0, high = arr.length-1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(arr[mid] == target)
            {
                System.out.println("Element found at index: " + mid);
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else if(arr[mid] > target)
            {
                high = mid - 1;
            }
        }
        System.out.println("Element can be inserted at index position: " + low);
    }
}
