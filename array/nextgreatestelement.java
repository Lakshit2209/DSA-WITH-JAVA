package array;

public class nextgreatestelement {
    public static void main(String[] args) {
        int[] a={12,23,45,23,15,64,23};
        int n=a.length;
        int[] b=new int[n];
//        method 1
  b[n-1]=-1;
//        for(int i=0;i<n-1;i++){
//            int mx=Integer.MIN_VALUE;
//            for(int j=i+1;j<n;j++){
//                mx=Math.max(a[j],mx);
//            } b[i]=mx;
//        }
//        method 2
        int nge=a[n-1];
        for(int i=n-2;i>=0;i--){
            b[i]=nge;
            nge=Math.max(nge,a[i]);
        }
        for(int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele:b){
            System.out.print(ele+" ");
        }
    }
}
