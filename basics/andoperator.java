package basics;

import java.util.Scanner;

public class andoperator {
    public static void main(String[] args) {
        System.out.print("Enter a number=");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a>99&&a<1000)
        {
            System.out.println("3 digit number ");

        }
        else {
            System.out.println("not a 3 digit number");
        }
        }

    }

