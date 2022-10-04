package DSA_Queue_and_Deque;

import java.util.ArrayDeque;

public class maximums_in_Ksized_subarrays {
    public static void main(String[] args) {
        int [] arr = {20,40,30,10,60};
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int n = arr.length;
        int k = 3;
        for(int i = 0; i < k; i++){
            while(!deque.isEmpty() && arr[deque.peekFirst()] <= arr[i]){
                deque.pollFirst();
            }
            deque.offerLast(i);
        }
        for(int i = k; i < n; i++){
            System.out.println(arr[deque.peekFirst()]);
            while(!deque.isEmpty() && deque.peekFirst() <= i-k){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        System.out.println(arr[deque.peekFirst()]);
    }
}
