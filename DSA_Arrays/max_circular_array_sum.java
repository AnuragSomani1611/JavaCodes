package DSA_Arrays;

public class max_circular_array_sum {
    public static int normalMaxSum(int []arr, int n){
        int maxEnding = 0;
        int res = 0;
        for(int i = 1; i < n; i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static int maxCircularSum(int []arr, int n) {
        //int arr[] = {8, -4, 3, -5, 4};
        int max_normal = normalMaxSum(arr, arr.length);
        if(max_normal < 0){
            return max_normal;
        }
        int arr_sum = 0;
        for(int i = 0; i < n; i++){
            arr_sum += arr[i];
            arr[i] = -1 * arr[i];
        }
        int max_circular = arr_sum + normalMaxSum(arr, n);
        return Math.max(max_normal, max_circular);
    }

    public static void main(String[] args) {
        int arr[] = {8, -4, 3, -5, 4};
        System.out.println(maxCircularSum(arr, arr.length));
    }
}
