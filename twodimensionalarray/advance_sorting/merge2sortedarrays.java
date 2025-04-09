package advance_sorting;

public class merge2sortedarrays {
    public static void print(int[] a){
        for(int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a,int[] b,int[] c){
   int i=0,j=0,k=0;
   while(i<a.length && j<b.length){
       if(a[i]<b[j]) c[k++]=a[i++];
       else c[k++]=b[j++];
   }
   while(j<b.length) c[k++]=b[j++];
        while(i<a.length) c[k++]=a[i++];
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int[] b={7,8,9};
        int[] c=new int[a.length+b.length];
        print(a);
        print (b);
        merge(a,b,c);
 print (c);
    }
}
