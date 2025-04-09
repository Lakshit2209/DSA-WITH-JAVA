package array;

import java.util.Arrays;

public class shallowdeepcopy {
    public static void main(String[] args) {
        int[] arr={12,24,125,124,25,352,42,345};
        for(int element : arr)
        {
            System.out.print(element+" ");
        }
        System.out.println();
//        int[] nums=arr;   // shallow copy
//        nums[0]=34;
//        System.out.print(arr[0]);
        int[] brr= Arrays.copyOf(arr,arr.length); //deep copy
        for(int element : brr)
        {
            System.out.print(element+" ");
        }
        System.out.println();
        brr[0]=34;
        System.out.println(arr[0]);
        // another method for deep copy
        int[] crr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
     crr[i]=arr[i];

        }
        crr[0]=100;
        System.out.println(arr[0]);
    }
}
