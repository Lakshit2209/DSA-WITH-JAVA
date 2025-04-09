package array;

import java.util.Scanner;

public class studentsmarks {
    public static void main(String[] args) {
        System.out.print("Enter n= ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<=n-1;i++) {
           arr[i]=sc.nextInt();
        }
        for(int i=0;i<=n;i++) {

           if(arr[i]<35) System.out.print(i+" ");

        }

    }
}
