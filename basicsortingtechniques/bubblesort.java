package basicsortingtechniques;

public class bubblesort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {


    int[] arr={2,63,25,157,1,3,52,9};
    print(arr);
    int n=arr.length;
    boolean flag =true;
    for(int x=0;x<n-1;x++){
        for(int i=0;i<n-1-x;i++){
            if(arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            flag=false;
        }}
        if(flag==true) break;
    }

        print(arr);
}}
