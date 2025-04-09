package stack;

import java.util.Stack;

public class reversestack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        System.out.println(st1);
        Stack<Integer> st2 = new Stack<>();
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        System.out.println(st2);
    }
}

