package basics;

import java.util.Scanner;

public class gradeofswtudents {
    public static void main(String[] args) {
        System.out.print("Enter marks=");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=90&&a<=100) System.out.println("A+");
        if(a>=80&&a<=89) System.out.println("A");
        if(a>=70&&a<=79) System.out.println("B+");
        if(a>=60&&a<=69) System.out.println("B");
        if(a>=50&&a<=59) System.out.println("C+");
        if(a>=40&&a<=49) System.out.println("C");
        if(a<=39) System.out.println("Fail");
        if(a>100) System.out.println("Invalid");
    }
}
