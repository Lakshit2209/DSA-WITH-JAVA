package basics;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        System.out.print("Enter number=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n<=10)
        {
            System.out.println("Hello World");
            n++;
        }
    }
}
