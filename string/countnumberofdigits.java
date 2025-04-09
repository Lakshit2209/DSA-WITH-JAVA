package string;

import java.util.Scanner;

public class countnumberofdigits {
    public static void main(String[] args) {
        System.out.print("Enter a number=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        String s=""+n;
//        String s=Integer.toString(n);

        System.out.print(Integer.toString(n).length());
    }
}
