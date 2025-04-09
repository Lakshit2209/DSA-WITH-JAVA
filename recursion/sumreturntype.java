package recursion;

import java.util.Scanner;

public class sumreturntype {
    public static int sum(int n){
        if(n==0||n==1){
            return n;
        }
       return n + sum(n-1);
    }
    public static void main(String[] args) {
        System.out.print("Enter the value of n=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));

    }
}
