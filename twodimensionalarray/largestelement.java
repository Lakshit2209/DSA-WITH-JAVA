package twodimensionalarray;

public class largestelement {
    public static void main(String[] args) {
        int[][] a={{2,5},{4,6},{10,2}};
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){

                mx=Math.max(mx,a[i][j]);

            }
        }
        System.out.println(mx);
    }
}
