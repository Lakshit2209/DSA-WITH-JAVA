package string;

public class inputandupdate {
    public static void main(String[] args) {
        String a=("Lakshit");
        int n=a.length();
        String s="";

        for(int i=0;i<n;i++){

            if(i%2==0)  s+='a';
            else s+=a.charAt(i);
        }
        System.out.println(s);
    }
}
