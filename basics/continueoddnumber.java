package basics;

public class continueoddnumber {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            if (i % 2 == 0) continue;
            else System.out.println(i);
        }
        // Question
//        int x=4,y=0;
//        while(x>=0){
//            x--;
//            y++;
//            if(x==y) continue;
//            else System.out.println(x+""+y);
//        }
    }
}
