package recursion;

import java.util.Scanner;

public class binarystringsnoconsecutiveones {
    public static void print(String s,int n){
        int m=s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        if(m==0|| s.charAt(m-1)=='0'){
            print(s+1,n);
            print(s+0,n);
        }
        else print(s+0,n);
    }
    public static void main(String[] args) {
        System.out.print("Enter value of n=");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        print("",n);
    }
}
