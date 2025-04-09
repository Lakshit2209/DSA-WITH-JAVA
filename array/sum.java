package array;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.print("Enter n= ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        int i,sum=0;
        for( i=0;i<=n-1;i++) {
            arr[i]=sc.nextInt();
        }
        for( i=0;i<=n-1;i++) {
            sum= sum+arr[i];

        }
        System.out.print(sum);

    }
}
