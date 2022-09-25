package DSA_Arrays;

public class maximum_sum_subarray {
    public static void main(String[] args) {
        int []arr = {-3, 8, 2, 4, -5, 6};
        int res = arr[0], maxEnding = arr[0];
        for(int i = 1; i < arr.length; i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        System.out.println(res);
    }
}
