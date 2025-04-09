package basics;

import java.util.Scanner;

public class triangleornot {
    public static void main(String[] args) {
        System.out.print("Enter 1 side of triangle=");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Enter 2 side of triangle=");
        Scanner ac=new Scanner(System.in);
        int b=ac.nextInt();
        System.out.print("Enter 3 side of triangle=");
        Scanner bc=new Scanner(System.in);
        int c=bc.nextInt();
        if(a+b>c&&b+c>a&&c+a>b)
        {
            System.out.println("It is a triangle ");
        }
        else System.out.println("It is not a triangle");

    }
}
