package basicsortingtechniques;

public class selectionsort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={-92,5,-4,-8,215,567};
        print(arr);
       int n=arr.length;
       int mindx=-1;

       for(int i=0;i<n-1;i++) {
           int min=Integer.MAX_VALUE;
           for (int j = i; j < n; j++) {
               if (arr[j] < min) {
                   min = arr[j];
                   mindx = j;
               }
           }
           int temp = arr[i];
           arr[i] = arr[mindx];
           arr[mindx] = temp;
       }
       print(arr);
    }
}
