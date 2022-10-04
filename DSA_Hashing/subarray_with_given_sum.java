package DSA_Hashing;

import java.util.HashSet;

public class subarray_with_given_sum {
    public static void main(String[] args) {
        int arr[] = {5,8,6,13,3,-1};
        int sum = 22;
        int pre_sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            pre_sum += arr[i];
            if(pre_sum == sum){
                System.out.println(true);
                break;
            }
            if(set.contains(pre_sum - sum)){
                System.out.println(true);
                break;
            }
            set.add(pre_sum);
        }
        System.out.println(set);
    }
}
