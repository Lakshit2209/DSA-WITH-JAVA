package array;

public class arraytomethods {
    public static void main(String[] args) {
        int[] arr = {24, 36, 2365, 216, 25, 34};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] arr) {
        arr[0] = 454;
    }
}