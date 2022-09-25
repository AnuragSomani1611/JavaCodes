package DSA_Arrays;
public class SWT_max_sum_k_consec_elements {
    public static void main(String[] args) {
        int[] arr= {10, 20, 10, 60, 50, 80, 80, 90, 10};
        int k = 2;
        int curr_sm = 0;
        for(int i = 0; i < k; i++){
            curr_sm += arr[i];
        }
        int max_sum = curr_sm;
        for(int i = k; i < arr.length; i++){
            curr_sm += (arr[i] - arr[i-k]);
            max_sum = Math.max(curr_sm, max_sum);
        }
        System.out.println(max_sum);
    }
}
