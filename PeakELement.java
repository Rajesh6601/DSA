import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class PeakELement {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Queue<Object> q1 = new LinkedList<>();

        int targetValue = 5;

        int result = binarySearch(sortedArray);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }

    // Binary search implementation
    private static int binarySearch(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//
//            if (arr[mid] == target) {
//                return mid; // Element found
//            } else if (arr[mid] < target) {
//                low = mid + 1; // Search the right half
//            } else {
//                high = mid - 1; // Search the left half
//            }
//        }

        return -1; // Element not found
    }
}

