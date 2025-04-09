package array;

public class sort0and1inarray {
    public static void main(String[] args) {
        int[] arr= {1,0,1,1,0,0,0,0,1,1,0,1,0,1};
        int n=arr.length;
      //  method 1
//        int noofZeroes=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0) noofZeroes++;
//        }
//        for(int i=0;i<noofZeroes;i++) arr[i]=0;
//        for(int i=noofZeroes;i<n;i++) arr[i]=1;
//        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
       int i=0; int j=n-1;
        while(i<j){

            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i>j) break;
            if(arr[i]==1&&arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }


        }
        for(i=0;i<n;i++) System.out.print(arr[i]+" ");
   }

}
