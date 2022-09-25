package Queue;
import java.util.*;
public class ReverseKItems {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 3;
        Queue<Integer> queue = new ArrayDeque<>();
        for(int e: arr){
            queue.add(e);
        }
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < k; i++){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.offer(stack.poll());
        }
        for(int i = 0; i < arr.length - k; i++){
            queue.offer(queue.poll());
        }
        System.out.println(queue);
    }
}