package array;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        System.out.print("Enter size of array= ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter the element ot search=");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();

        int[] arr= new int[n];
       int i;
        for( i=0;i<=n-1;i++) {
            arr[i]=sc.nextInt();
        }
        for( i=0;i<=n-1;i++) {
           if(arr[i] ==a) System.out.println(i+" "+arr[i]+" ");
        }
    }
}
