package patternprinting;

import java.util.Scanner;

public class specialtriangle {
        public static void main(String[] args) {
//            System.out.print("Enter no of rows=");
//            Scanner sc=new Scanner(System.in);
//            int a=sc.nextInt();
//            System.out.print("Enter no of column=");
//            Scanner c=new Scanner(System.in);
//            int b=c.nextInt();
//            for(int i=1;i<=a;i++){
//                for(int j=1;j<=i;j++) System.out.print(2*j-1 +" "  );
//                System.out.println();
            System.out.print("Enter no of rows=");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();

            for(int i=1;i<=a;i++){
                int n=1;
                for(int j=1;j<=i;j++)
                {System.out.print(n +" "  );
                n+=2;}
                System.out.println();
            }}


        }

