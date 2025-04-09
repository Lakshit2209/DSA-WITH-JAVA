package basics;

import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args) {
        System.out.print("Enter first number=");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.print("Enter second number=");
        Scanner c= new Scanner(System.in);
        int b= c.nextInt();
        System.out.println((a>b)? "First is greater":"Second is greater");
    }
}
