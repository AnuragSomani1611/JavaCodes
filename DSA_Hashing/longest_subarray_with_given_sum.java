package DSA_Hashing;

import java.util.HashMap;

public class longest_subarray_with_given_sum {
    public static void main(String[] args) {
        int arr[] = {3,1,0,1,8,2,3,6};
        int sum = 5;
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int pre_sum = 0;
        for(int i = 0; i < arr.length; i++){
           pre_sum += arr[i];
           if(pre_sum == sum){
               res = Math.max(i+1, res);
           }
           if(!map.containsKey(pre_sum)){
               map.put(pre_sum, i);
           }
           if(map.containsKey(pre_sum - sum)){
               res = Math.max(i-map.get(pre_sum-sum), res);
           }
        }
        System.out.println(res);
    }
}
