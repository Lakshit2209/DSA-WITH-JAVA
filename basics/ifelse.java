package basics;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        System.out.print("Enter a number =");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if (a%2==0)
            System.out.println("number is even");
        else
            System.out.println("number is odd");
    }
}
