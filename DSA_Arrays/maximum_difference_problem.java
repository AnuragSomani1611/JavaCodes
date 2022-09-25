package DSA_Arrays;
public class maximum_difference_problem {
    public static void main(String[] args) {
        int[] arr = {20, 10, 33, 8, 35, 50, 60};
        int res = 0, n = arr.length;
        int max = arr[1] - arr[0];
        for(int i = 1; i < n; i++){
            max = Math.max(max, arr[i] - arr[res]);
            if(arr[res] > arr[i]){
                res = i;
            }
        }
        System.out.println(max);
    }
}
