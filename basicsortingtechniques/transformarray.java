package basicsortingtechniques;

public class transformarray {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {92, 5, 4, 8, 215};
        print(arr);  // Print the original array

        int x = 0;  // Start value for replacement
        int n = arr.length;
        // Loop to replace the smallest positive numbers with decreasing values of x
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;

            int mindx = -1;

            // Find the smallest positive number
            for (int j = 0; j < n; j++) {
                if (arr[j] < min && arr[j]>0) {
                    min = arr[j];
                    mindx = j;
                }
            }
            arr[mindx] = x;
            x--;  // Decrement x for the next replacement

        }

        // Negate all elements at the end
        for (int i = 0; i < n; i++) {
            arr[i] *= -1;
        }

        // Print the transformed array
        print(arr);
    }
}

