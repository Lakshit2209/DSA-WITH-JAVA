package basics;

import java.util.Scanner;
public class arithematicexpression {
    public static void main(String[] args) {
        System.out.print("Enter the value of n=");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//        for(int i=1;i<=2*n-1;i+=2){
//            System.out.println(i);
//        }
        int a=4,d=3;
        for(int i=0;i<=n;i++) {
            System.out.println(a);
            a = a + d;
        }

    }
}
