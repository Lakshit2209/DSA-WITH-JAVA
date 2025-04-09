package recursion;

public class printarrayusingrecursion {
    public static void print(int n,int[] arr){
        if(n==arr.length) return;
        System.out.print(arr[n]+" ");
        print(n+1,arr);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,4,2,4};
        print(0,arr);
    }
}
