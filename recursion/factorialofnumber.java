package recursion;

import java.util.Scanner;

public class factorialofnumber {
    public static int factorial(int n){
        if(n==1||n==0) return 1;
        int a= n*factorial(n-1);
        return a;
    }
    public static void main(String[] args) {
        System.out.print("Enter the value of n=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));

    }
}
