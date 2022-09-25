package DSA_Arrays;
import java.util.HashMap;
import java.util.HashSet;
public class SWT_distinct_ele_in_window_k {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 1, 3, 4, 5, 5, 7};
        int k = 3;
        int unique = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i < k; i++){
            hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(hs.size());
        for(int i = k; i < arr.length; i++){
            if(hs.get(arr[i-k]) < 2){
                hs.remove(arr[i-k]);
            }
            else{
                hs.put(arr[i-k], hs.get(arr[i-k]) - 1);
            }
            hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
            System.out.println(hs.size());
        }
    }
}
