package twodimensionalarray;

public class sumofelements {
    public static void main(String[] args) {
        int[][] a={{2,5},{4,6},{10,2}};
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){

              sum+=a[i][j];

            }
        }
        System.out.println(sum);
    }
}
