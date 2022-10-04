package DSA_Queue_and_Deque;

import java.util.ArrayDeque;

public class reversing_queue {
    public static void reverse(ArrayDeque<Integer> queue){
        if(queue.isEmpty()){
            return;
        }
        int temp = queue.pop();
        reverse(queue);
        queue.offer(temp);
    }
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while(!queue.isEmpty()){
            stack.push(queue.pop());
        }
        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);
    }
}
