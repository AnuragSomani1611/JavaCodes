package DSA_Arrays;

public class PS_equilibrium_in_array {
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 6, 5, 4};
        int[] prefix_sum = new int[arr.length];
        prefix_sum[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefix_sum[i] += prefix_sum[i-1] + arr[i];
        }
        int l_sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(l_sum == prefix_sum[arr.length - 1] - arr[i]){
                System.out.println(true);
                break;
            }
            l_sum = prefix_sum[i];
        }
    }
}
