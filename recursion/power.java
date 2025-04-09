package recursion;

import java.util.Scanner;

public class power {
    public static int power(int a,int b){
        if(b==0) return 1;
        return a*power(a,(b/2)^2);
    }
    public static int power2(int a,int b){
        if(b==0) return 1;
        int ans=power2(a,b/2);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;
    }
    public static void main(String[] args) {
    System.out.print("Enter the number:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
        System.out.print("Enter the power:");
    int b=sc.nextInt();
    System.out.println("Answer is: " +power2(a,b));

}
}
