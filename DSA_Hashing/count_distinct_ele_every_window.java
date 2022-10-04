package DSA_Hashing;
import java.util.*;
public class count_distinct_ele_every_window {
    public static void main(String[] args) {
        int arr[] = {10,20,20,10,30,40,10};
        int n = arr.length;
        int k = 4;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < k; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map.size());
        for(int i = k; i < n; i++){
            map.put(arr[i-k], map.get(arr[i-k])-1);
            if(map.get(arr[i-k]) == 0){
                map.remove(arr[i-k]);
            }
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            System.out.println(map.size());
        }
    }
}
