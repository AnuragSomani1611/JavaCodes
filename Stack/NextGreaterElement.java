package Stack;
import java.util.ArrayDeque;
import java.util.Deque;
public class NextGreaterElement {
    public static void main(String[] args) {
        int []arr = {5, 15, 10, 8, 6, 12, 7};
        Deque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        int []arr1 = new int[n];
        stack.push(arr[n-1]);
        arr1[n-1] = -1;
        for(int i = n-2; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            arr1[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr1[i]);
        }
    }
}
