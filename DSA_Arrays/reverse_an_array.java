package DSA_Arrays;

import java.util.Arrays;

public class reverse_an_array {
    public static void swap(int[] arr, int low, int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 33, 45, 35, 50, 60};
        int low = 0, high = arr.length-1;
        while(low < high){
            swap(arr, low, high);
            low++;
            high--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
