package basics;

import java.util.Scanner;

public class geometricprogression {
    public static void main(String[] args) {
        System.out.print("Enter the value of n=");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=3;
        for (int i = 1; i <=n ; i++) {
            System.out.println(a);
            a*=3;
        }
    }
}
