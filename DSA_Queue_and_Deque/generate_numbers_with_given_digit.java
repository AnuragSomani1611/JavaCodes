package DSA_Queue_and_Deque;

import java.util.ArrayDeque;

public class generate_numbers_with_given_digit {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        int n = 5;
//        queue.offer("5");
//        queue.offer("6");
        queue.offer("9");
        for(int i = 0; i < n; i++){
            String temp = queue.pop();
            System.out.println(temp);
            queue.offer(temp + "0");
//            queue.offer(temp + "5");
//            queue.offer(temp + "6");
            queue.offer(temp + "9");

//            if(Integer.valueOf(temp) % 7 == 0){
//                System.out.println(temp);
//            }
        }
    }
}
