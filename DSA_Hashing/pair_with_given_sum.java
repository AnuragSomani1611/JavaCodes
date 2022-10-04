package DSA_Hashing;

import java.util.HashSet;

public class pair_with_given_sum {
    public static void main(String[] args) {
        int arr[] = {11,5,6};
        int sum = 10;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(set.contains(sum - arr[i])){
                System.out.println(true);
                break;
            }
            set.add(arr[i]);
        }
    }
}
