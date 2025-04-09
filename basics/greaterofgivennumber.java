package basics;

import java.util.Scanner;

public class greaterofgivennumber {
    public static void main(String[] args) {
        System.out.print("Enter first number=");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Enter second number=");
        Scanner z=new Scanner(System.in);
        int b=z.nextInt();
        System.out.print("Enter third number=");
        Scanner o=new Scanner(System.in);
        int c=o.nextInt();
        if(a>b&&a>c) System.out.println("First number is greatest");
        if(b>a&&b>c) System.out.println("Second number is greatest");
        if(c>a&&c>b) System.out.println("Third number is greatest");

    }
}
