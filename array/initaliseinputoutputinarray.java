package array;

import java.util.Scanner;

public class initaliseinputoutputinarray {
    public static void main(String[] args) {
        System.out.print("Enter length of array:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++) arr[i]=sc.nextInt();
        for(int i=0;i<=n-1;i++) System.out.print(arr[i]+" ");
    }
}
