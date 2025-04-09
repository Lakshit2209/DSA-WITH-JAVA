package basics;

import java.util.Scanner;

public class profitorloss {
    public static void main(String[] args) {
        System.out.print("Enter cost price=");
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        System.out.print("Enter selling price=");
        Scanner c=new Scanner(System.in);
        double b= c.nextDouble();
        if(a>b){
            System.out.print("Profit of rs. ");
            System.out.println(a-b);
        }

        if(a<b){
            System.out.print("loss of rs.");
            System.out.print(a-b);
        }
        if (a-b == 0){
            System.out.println("no profit nor loss");
        }

    }
}
