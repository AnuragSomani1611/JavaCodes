package DemoProgs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {5, 15, 10, 8, 6, 12, 7};
        Deque<Integer> stack = new ArrayDeque<>();
        int res[] = new int[arr.length];
        res[arr.length-1] = -1;
        int size = arr.length;
        for(int i = size-2; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            arr[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));
    }
}
