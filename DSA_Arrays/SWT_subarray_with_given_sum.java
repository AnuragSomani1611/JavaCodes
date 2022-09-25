package DSA_Arrays;
//unsorted non negative array
public class SWT_subarray_with_given_sum {
    public static void main(String[] args) {
        int[] arr= {10, 20, 10, 60, 50, 80, 80, 90, 10};
        int sum = 110;
        int curr_sum = arr[0], s = 0;
        for(int i = 1; i < arr.length; i++){
            while(curr_sum > sum && s < i-1){
                curr_sum -= arr[s];
                s++;
            }
            if(curr_sum == sum){
                System.out.println("true" + " " + s + " " + i);
                break;
            }
            curr_sum += arr[i];
        }

    }
}
