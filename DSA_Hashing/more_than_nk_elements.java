package DSA_Hashing;

import java.util.HashMap;
import java.util.Map;

public class more_than_nk_elements {
    public static void main(String[] args) {
        int arr[] = {30,10,20,20,20,10,40,30,30};
        int n = arr.length;
        int k = 4;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else if(map.size() < k-1){
                map.put(arr[i], 1);
            }
            else{
                for(Map.Entry<Integer, Integer> e: map.entrySet()){
                    map.put(e.getKey(), e.getValue()-1);
                    if(e.getValue() == 0){
                        map.remove(e.getKey());
                    }
                }
            }
        }
        System.out.println(map);
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue() >= n/k){
                System.out.println(e.getKey());
            }
        }
    }
}
