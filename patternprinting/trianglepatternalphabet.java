package patternprinting;

import java.util.Scanner;

public class trianglepatternalphabet {
    public static void main(String[] args) {
        System.out.print("Enter no of rows=");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Enter no of column=");
        Scanner c=new Scanner(System.in);
        int b=c.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++)
                System.out.print((char)(j+64)+" ");
            System.out.println();
        }

    }
}
