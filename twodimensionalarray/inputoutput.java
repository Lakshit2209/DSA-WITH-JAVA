package twodimensionalarray;

import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        System.out.print("Enter number of rows=");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Enter number of columns=");
        int b=sc.nextInt();
        int[][] arr=new int[a][b];
        int m=arr.length;
        System.out.println(m);
        int n=arr[0].length;
        System.out.println(n);
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
