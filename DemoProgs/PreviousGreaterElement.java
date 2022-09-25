package DemoProgs;// same concept as Stock Span Problem
import java.util.ArrayDeque;
import java.util.Deque;
public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = {15, 10, 18, 12, 4, 6, 2, 8};
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(arr[0]);
        System.out.print(-1 + " ");
        for(int i = 1; i < arr.length; i++){
          while(!stack.isEmpty() && stack.peek()<=arr[i]){
              stack.pop();
          }
          System.out.println(stack.isEmpty() ? -1 : stack.peek());
          stack.push(arr[i]);
        }
    }
}
