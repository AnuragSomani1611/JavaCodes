package DemoProgs;

import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpanPrice {
    public static void main(String[] args) {
        int arr[] = {13,12,11,20,30,10,9,21,32};
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        int span = 1;
        System.out.println(1);
        for(int i = 1; i < arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            span = stack.isEmpty() ? i+1 : i-stack.peek();
            System.out.println(span+" ");
            stack.push(i);
        }
    }
}
