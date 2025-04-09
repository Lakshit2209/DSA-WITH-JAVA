package array;

import java.util.Scanner;

public class maxnumber {
    public static void main(String[] args) {
        System.out.print("Enter size of array= ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr= new int[n];
        int i;
        for( i=0;i<=n-1;i++) {
            arr[i]=sc.nextInt();
        }
//        int mx=arr[0];
//        for( i=1;i<=n-1;i++){
//            if(arr[i]>mx) mx=arr[i];
//        }
        int mx=Integer.MIN_VALUE;
        for(i=0;i<=n-1;i++){
            mx =Math.max(mx,arr[i]);
        }
        System.out.println("Max number ="+mx);
}}
