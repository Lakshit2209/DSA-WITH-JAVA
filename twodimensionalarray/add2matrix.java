package twodimensionalarray;


public class add2matrix {
    public static void main(String[] args) {


    int[][] a={{2,5,3},{5,4,6},{6,10,2}};
    int[][] b={{3,2,5},{3,4,6},{3,10,2}};
    int m=a.length;
    int n=a[0].length;
   int[][] res=new int[m][n];
        for(int i=0;i< m;i++){
        for(int j=0;j<n;j++){

          res[i][j]=a[i][j]+b[i][j];

        }
    }
         for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){

            System.out.print(res[i][j]+" ");

        }
             System.out.println();
    }

}}
