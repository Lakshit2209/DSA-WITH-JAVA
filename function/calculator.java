package function;

import java.util.Scanner;

import static java.awt.AWTEventMulticaster.add;


public class calculator {
    public static void main(String[] args) {
        System.out.print("Enter the value of a=");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Enter the value of b=");
        Scanner av= new Scanner(System.in);
        int b=sc.nextInt();
        cal calculator=new cal();
       calculator.add(a,b);
    }
    }
    class cal{
    int x,y,z;
    void add(int y,int z){
        x=y+z;
        System.out.println(x);
    }
    }

