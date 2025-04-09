package recursion;

import java.util.Scanner;

public class Nthstairpath {
    public static int stair(int n){
        if(n<=2) return n;
        return stair(n-1)+ stair(n-2);
    }
    public static void main(String[] args) {
        System.out.print("Enter the value of n=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(stair(n));

    }
}
