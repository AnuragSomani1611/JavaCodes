package DSA_Arrays;
public class longest_even_odd_subarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2, 6, 8, 10, 1, 2, 3, 4, 5};
        int res = 1;
        int count = 1;
        for(int i = 1; i < arr.length; i ++){
            if((arr[i] % 2 == 0 && arr[i-1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i-1] % 2 == 0)){
                count++;
                res = Math.max(res, count);
            }
            else
                count = 1;
        }
        System.out.println(res);
    }
}
