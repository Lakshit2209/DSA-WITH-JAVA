package recursion;

import java.util.Scanner;

public class mazepath {
//    public static int maze(int row,int col,int m,int n){
//       if(row==m|| col==n) return 1;
//       int rightways=maze(row,col+1,m,n);
//        int leftways=maze(row+1,col,m,n);
//        return rightways+leftways;
//    }
    public static int maze2(int m,int n){
        if(m==1|| n==1) return 1;
        int rightways=maze2(m,n-1);
        int leftways=maze2(m-1,n);
        return rightways+leftways;
    }
    public static void main(String[] args) {
        System.out.print("Enter the value of m=");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.print("Enter the value of n=");
        int n=sc.nextInt();
//        System.out.println(maze(1,1,m,n));
        System.out.println(maze2(m,n));
    }
}
