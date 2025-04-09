package recursion;

import java.util.ArrayList;

public class subsets {
    static ArrayList<String> arr=new ArrayList<>();
    public static void print(int i,String s,String ans){
        if(i==s.length()){
           // System.out.println(ans);
            arr.add(ans);
            return;
        }
        char ch=s.charAt(i);
        print(i+1,s,ans);
        print(i+1,s,ans+ch);
    }
    public static void main(String[] args) {
        arr=new ArrayList<>();
        String s="abc";
        print(0,s,"");
        System.out.println(arr);
    }
}
