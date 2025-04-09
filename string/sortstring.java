package string;

import java.util.Arrays;

public class sortstring {
    public static void main(String[] args) {
        String s=("lakshit");
        char[] ch= s.toCharArray();
        Arrays.sort(ch);
        for(char ele: ch)
        {
            System.out.print(ele);
    }
}}
