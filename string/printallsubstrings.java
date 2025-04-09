package string;

import java.util.Scanner;

public class printallsubstrings {
    public static void main(String[] args) {
        System.out.print("Enter string=");
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        int n=a.length();
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++) {
                System.out.print(a.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
