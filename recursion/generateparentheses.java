package recursion;

import java.util.Scanner;

public class generateparentheses {
    public static void generate(int open ,int close ,int n,String s){
        if(s.length()==2*n){
            System.out.println(s);
            return ;
        }
        if(open<n) generate(open+1,close,n,s+"(");
        if(close<open) generate(open,close+1,n,s+")");
    }
    public static void main(String[] args) {
        System.out.print("Enter value of n=");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        generate(0,0,n,"");
    }
}
