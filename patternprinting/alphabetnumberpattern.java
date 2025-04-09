package patternprinting;

import java.util.Scanner;

public class alphabetnumberpattern {
    public static void main(String[] args) {
        System.out.print("Enter no  =");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if(i % 2 == 0)
                {System.out.print(j + " ");}
                else {System.out.print((char) (j + 64) + " ");}
            }
            System.out.println();
        }

    }
}
