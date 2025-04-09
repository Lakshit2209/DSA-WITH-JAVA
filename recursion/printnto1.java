package recursion;

import java.util.Scanner;

public class printnto1 {
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);

    }
    public static void main(String[] args) {
    System.out.print("Enter the value of n=");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    print(n);

}
}
