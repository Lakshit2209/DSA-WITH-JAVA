package basicsortingtechniques;

public class arrayissortedornot {
    public static void main(String[] args) {
        int[] arr={12,45,124,14,56,2144,53};
      boolean flag=true;
      for(int i=0;i<arr.length;i++){
          if(arr[i]>arr[i+1]) {
              flag=false;
              break;
          }
      }
      if(flag==true) System.out.println("array is sorted");
      else System.out.println("not sorted");
    }
}
