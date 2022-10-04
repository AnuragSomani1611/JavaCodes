package DSA_Hashing;

import java.util.HashSet;

public class subarray_with_zero_sum {
    public static void main(String[] args) {
        int arr[] = {3,4,3,-1,1};
        int n = arr.length;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(set.contains(sum)){
                System.out.println("yes");
                break;
            }
            if(sum == 0){
                System.out.println("yes");
                break;
            }
            set.add(sum);
        }
    }
}
