package basics;

import java.util.Scanner;

public class modulus {
    public static void main(String[] args) {
        System.out.print("Enter the value of a=");
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble();
        System.out.print("Enter the value of b=");
        Scanner s= new Scanner(System.in);
        double b=s.nextDouble();
        double c=a%b;
        System.out.println(c);

    }
}
