package DemoProgs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class MaxInAllSubarrayOfSizeK {
    public static void main(String[] args) {
        int []arr = {10, 8, 5, 12, 15, 7, 6};
        Deque<Integer> dq = new ArrayDeque<>();
        int k = 3;
        for(int i = 0; i<k; i++){
            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        for(int i = k; i < arr.length; i++){
            System.out.println(arr[dq.peekFirst()]);
            while(!dq.isEmpty() && dq.peekLast()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        System.out.println(arr[dq.peekFirst()]);
    }
}
