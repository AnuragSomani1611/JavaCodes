package DSA_Stack;
import java.util.ArrayDeque;
import java.util.Deque;
public class stock_span {
    public static void main(String[] args) {
        int []arr = {80, 10, 60, 40, 35, 30, 50, 70, 85};
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        int span = 1;
        System.out.println(span);
        for(int i = 1; i < arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            span = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            System.out.println(span);
            stack.push(i);
        }
    }
}
