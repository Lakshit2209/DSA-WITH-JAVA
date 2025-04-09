package twodimensionalarray.arraylist2d;

public class scoreafterflippingmatrix {
    public static void main(String[] args) {
        int[][] arr={{1,0,0,1},{1,1,0,0},{0,1,1,0}};
        int m=arr.length,n=arr[0].length;
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                for(int j=0;j<n;j++){
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }}
        for(int j=1;j<n;j++){
            int noofZeroes=0,noofOnes=0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==0) noofZeroes++;
                else noofOnes++;
            }
            if(noofZeroes > noofOnes){
                for(int i=0;i<m;i++){
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
        int score=0;
        int x=1;
        for(int j=n-1;j>=0;j--){
            for(int i=0;i<m;i++){
                score+=(arr[i][j]*x);
            }
            x*=2;
        }

    }
}
