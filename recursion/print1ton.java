package recursion;

import java.util.Scanner;

public class print1ton {
    public static void print(int n,int a)
    {  if(n>a) return;
        System.out.println(n);
       print(n+1,a);
    }

    public static void main(String[] args) {
    System.out.print("Enter the value of n=");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    print(1,a);

}
}
