package DSA_Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class common_span_in_2binaryarray {
    public static void main(String[] args) {
        int arr[] = {1,0,0,0,0,0};
        int arr1[] = {0,1,1,0,0,1};
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] - arr1[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int pre = 0;
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            pre += arr[i];
            if(pre == 0){
                res = i+1;
            }
            if(map.containsKey(pre)){
                res = Math.max(res, i-map.get(pre));
            }
            if(!map.containsKey(pre)){
                map.put(pre, i);
            }
        }
        System.out.println(res);
    }
}
