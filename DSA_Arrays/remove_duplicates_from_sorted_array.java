package DSA_Arrays;

import java.util.Arrays;

public class remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 45, 50, 50, 60};
        int res = 1;
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        System.out.println(res);
        System.out.println(Arrays.toString(arr));
    }
}
