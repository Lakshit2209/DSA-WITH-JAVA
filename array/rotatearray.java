package array;

import java.util.Arrays;

public class rotatearray {
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        // Ensure d is within bounds
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n -k- 1);

        // Step 2: Reverse the first d elements
        reverse(arr, n-k, k - 1);

        // Step 3: Reverse the remaining n - d elements
        reverse(arr, 0, n - 1);
    }

    // Helper function to reverse the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3; // Number of positions to rotate

        System.out.println("Original array: " + Arrays.toString(arr));

        rotateRight(arr, d);  // Rotate the array

        System.out.println("Array after " + d + " rotations to the right: " + Arrays.toString(arr));
    }

}
