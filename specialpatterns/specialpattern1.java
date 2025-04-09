package specialpatterns;

import java.util.Scanner;

public class specialpattern1 {
    public static void main(String[] args) {
        System.out.print("Enter value of n =");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
