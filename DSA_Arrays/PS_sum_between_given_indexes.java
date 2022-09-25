package DSA_Arrays;

public class PS_sum_between_given_indexes {
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 6, 5, 4};
        int[] prefix_sum = new int[arr.length];
        prefix_sum[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefix_sum[i] += prefix_sum[i-1] + arr[i];
        }
        int l = 2, r = 5;
        if(l != 0){
            System.out.println(prefix_sum[r] - prefix_sum[l-1]);
        }
        else{
            System.out.println(prefix_sum[r]);
        }
    }
}
