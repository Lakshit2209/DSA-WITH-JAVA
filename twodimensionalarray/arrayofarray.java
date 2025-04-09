package twodimensionalarray;

public class arrayofarray {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6}};
        for(int[] ele:a){
            for(int x:ele){
                System.out.print(x+" ");
            }

        }
    }
}
