package compositepatterns;

import java.util.Scanner;

public class compositepattern4 {
    public static void main(String[] args) {
        System.out.print("Enter value of n=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=2*n-1;i++){
            System.out.print("*"+" ");
           ;}
        System.out.println();
        n--;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n+1-i;j++){ System.out.print("*"+" ");

            }
            for(int j=1;j<=2*i-1;j++){ System.out.print(" "+" ");

            }
            for(int j=1;j<=n+1-i;j++){ System.out.print("*"+" ");

            }

            System.out.println();
        }
    }
}
