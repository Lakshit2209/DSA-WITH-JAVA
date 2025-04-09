package basics;

import java.util.Scanner;

public class oroperator {
    public static void main(String[] args) {
        System.out.print("Enter a number =");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if(a<100||a%2==0)
        {
            System.out.println("Number is less than 100 or may be even");
        }
        else {
            System.out.println("nor even or less than 100");
        }
    }
}
