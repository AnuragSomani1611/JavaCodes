package DSA_Hashing;

import java.util.*;

public class longest_sub_with_equal_0and1 {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,1,1,0};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }
        HashMap<Integer, Integer> set = new HashMap<>();
        int pres = 0;
        int res = 0;
        for(int i = 0; i < n; i++){
            pres += arr[i];
            if(pres == 0){
                res = i+1;
            }
            if(set.containsKey(pres)){
                res = Math.max(res, i-set.get(pres));
            }
            if(!set.containsKey(pres)){
                set.put(pres, i);
            }
        }
        System.out.println(res);
    }
}
