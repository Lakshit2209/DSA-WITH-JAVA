package binarysearch.java;

public class binarysearchs {
    public static void main(String[] args) {
        int[] arr={13,45,65,54,89};
        int n=arr.length;
        int target =45;
        int lo=0,hi=n-1;
        boolean flag=false;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
                flag = true;
                break;
            }
            else if(arr[mid]>target){ hi=mid-1;}
            else if(arr[mid]<target) {lo=mid+1;}
        }
        if(flag==true) System.out.println("target found");
        else System.out.println("target not found");

    }
}
