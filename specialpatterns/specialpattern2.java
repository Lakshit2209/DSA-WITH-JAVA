package specialpatterns;

import java.util.Scanner;

public class specialpattern2 {
    public static void main(String[] args) {
        System.out.print("Enter value of n =");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
int mid=n/2+1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==mid||j==mid) System.out.print("*"+" ");
                else System.out.print(" "+" ");

            }
            System.out.println();
        }

    }
}
