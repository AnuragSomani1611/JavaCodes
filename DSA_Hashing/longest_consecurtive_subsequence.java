package DSA_Hashing;
import java.util.HashSet;
public class longest_consecurtive_subsequence {
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,3,4,8,11,6};
        int n = arr.length;
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        for(int i = 0; i < n; i++){
            if(!set.contains(arr[i]-1)) {
                int curr = 1;
                while (set.contains(arr[i] + curr)) {
                    curr++;
                }
                res = Math.max(res, curr);
            }
        }
        System.out.println(res);
    }
}
