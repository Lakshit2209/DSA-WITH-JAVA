package basics;

import java.util.Scanner;

public class absolutenumber {
    public static void main(String[] args) {
        System.out.print("Enter a number=");
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        if(a>0)
        {
            System.out.println(a);}
        else {
            a = -a;
            System.out.println(a);
        }
    }
}
