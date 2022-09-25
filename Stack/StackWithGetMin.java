package Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StackWithGetMin {
    public static void push(Deque<Integer> stack, int x, Deque<Integer> stack1){
        stack.push(x);
        if(stack1.peek() >= stack.peek()){
            stack1.push(x);
        }
        else if(stack.isEmpty()){
            stack1.push(x);
        }
    }
    public static void pop(Deque<Integer> stack, int x, Deque<Integer> stack1){
        if(stack1.peek() == stack.peek()){
            stack1.push(x);
        }
        stack.pop();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> stack1 = new ArrayDeque<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            push(stack, temp, stack1);
        }
    }
}
