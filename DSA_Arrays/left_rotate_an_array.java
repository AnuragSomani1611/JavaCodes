package DSA_Arrays;
import java.util.Arrays;
public class left_rotate_an_array {
    public static void reverse(int[] arr, int low, int high){
        while(low < high){
            reverse_an_array.swap(arr, low, high);
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 33, 45, 35, 50, 60};
        int a = 3;
        reverse(arr, 0, a-1);
        reverse(arr, a, arr.length-1);
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}