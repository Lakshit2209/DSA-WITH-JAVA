package twodimensionalarray;

import java.util.Scanner;
// only for square matrix

public class rotatematrixby90 {
    public static void main(String[] args) {
        System.out.print("Enter number of rows=");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("Enter number of columns=");
        int b=sc.nextInt();
        int[][] arr=new int[a][b];
        int[][] ans=new int[a][b];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;}
            System.out.println();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i< arr.length;i++){
            int y=0,z=arr.length-1;
            while(y<z){

                int temp=arr[i][y];
                arr[i][y]=arr[i][z];
                arr[i][z]=temp;
                y++;
                z--;
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
