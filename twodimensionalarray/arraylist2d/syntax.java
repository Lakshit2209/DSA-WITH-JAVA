package twodimensionalarray.arraylist2d;

import java.util.ArrayList;
import java.util.List;

public class syntax {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(1); a.add(2);
        List<Integer> b=new ArrayList<>();
        b.add(3); b.add(4);
        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        d.add(5); d.add(6);
        List<List<Integer>> l=new ArrayList<>();
        l.add(a);l.add(b);l.add(c);l.add(d);
//        for(int i=0;i<l.size();i++){
//            System.out.print(l.get(i)+" ");
//            System.out.println();
//        }
        for(int i=0;i<l.size();i++){
            List<Integer> x=l.get(i);
            for(int j=0;j<x.size();j++){
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }
//        System.out.println( l.get(1).get(1));
    }
}
