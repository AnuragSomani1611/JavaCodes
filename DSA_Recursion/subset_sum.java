package DSA_Recursion;

public class subset_sum {
    public static int ssum(int []arr, int n, int sum){
        if(n == 0){
            return (sum == 0) ? 1:0;
        }
        return ssum(arr, n-1, sum) + ssum(arr, n-1, sum - arr[n-1]);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 20, 15};
        System.out.println(ssum(arr, arr.length, 25));
    }
}
