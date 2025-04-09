package array;

import java.util.Arrays;

public class foreachloop {
    public static void main(String[] args) {
        int[] arr={12,24,125,124,25,352,42,345};
        for(int element : arr)
        {
            System.out.print(element+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int element : arr)
        {
            System.out.print(element+" ");
        }
    }
}
