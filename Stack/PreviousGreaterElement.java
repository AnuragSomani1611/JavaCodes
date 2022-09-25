package Stack;
import java.util.ArrayDeque;
import java.util.Deque;
public class PreviousGreaterElement {
    public static void main(String[] args) {
        int []arr = {20, 30, 10, 5, 15};
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(arr[0]);
        int prevGreat = -1;
        System.out.println(prevGreat);
        for(int i = 1; i < arr.length; i++){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            prevGreat = stack.isEmpty() ? -1 : stack.peek();
            System.out.println(prevGreat);
            stack.push(arr[i]);
        }
    }
}
