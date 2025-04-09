package array;

import java.util.Scanner;

public class doubet {
    public static void main(String[] args) {
        System.out.print("Number of elements in array=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
            System.out.println();
        }
        System.out.print("Enter the value of target sum=");
        int x=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for( int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==x) System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}
