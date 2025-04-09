package basics;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        System.out.print("Enter first number=");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Enter second number=");
        Scanner z=new Scanner(System.in);
        int b=z.nextInt();
        System.out.println("What you want to perform");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("Enter choice:");
        Scanner er=new Scanner(System.in);
        int e=er.nextInt();
        switch (e){
            case 1:
                System.out.print("Addition is "+(a+b));
                break;
            case 2:
                System.out.print(a-b);
                break;
            case 3:
                System.out.print(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}
