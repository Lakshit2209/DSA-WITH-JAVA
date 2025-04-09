package string;

import java.util.Scanner;

public class builtinfunctionforstringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Lakshit");
        sb.append("yaduvanshi");
        System.out.println(sb);
        sb.insert(1,'i');
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);


    }
}
