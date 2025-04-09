package advance_sorting;

public class kthlargestelelement {
    static int ans;
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int[] a){
        for(int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int partition(int[] arr,int lo,int hi){
        int pivot =arr[lo], pidx=lo;
        int smallercount=0;
        for(int i=lo+1;i<=hi;i++){
            if(arr[i]<=pivot) smallercount++;
        }
        int correctidx=pidx+smallercount;
        swap(arr,pidx,correctidx);
        int i=lo,j=hi;
        while(i<correctidx&&j>correctidx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctidx;
    }
    public static void quickselect(int[] arr,int lo,int hi,int k){
        if(lo>=hi) return;
        if(lo==hi){
            if(lo==k-1) ans=arr[lo];
            return;
        }
        int idx=  partition(arr,lo,hi);
      if(idx==k-1){
          ans=arr[idx];
          return;
      }
       if(k-1<idx) quickselect(arr,lo,idx-1,k);
       else quickselect(arr,idx+1,hi,k);
    }
    public static void main(String[] args) {
        int[] arr={4,9,1,2,6,5,8};
        int n=arr.length;
        print(arr);
        int k=3;
        ans=-1;
        quickselect(arr,0,n-1,k);
        print(arr);
        System.out.println(ans);
    }
}
