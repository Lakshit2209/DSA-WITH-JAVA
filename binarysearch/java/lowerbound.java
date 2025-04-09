package binarysearch.java;

public class lowerbound {
    public static void main(String[] args) {
        int[] arr={13,45,65,54,89,100};
        int n=arr.length;
        int target=65;
        int lb=n;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=target){
                lb=Math.min(lb,mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(lb);
    }
}
