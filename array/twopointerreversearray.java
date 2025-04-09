package array;

public class twopointerreversearray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80};
        for(int ele:arr){
            System.out.print(ele+" ");}
        int n=arr.length;
        int i=0,j=n-1;
        while(i<=j){
            int  temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");}
}}
