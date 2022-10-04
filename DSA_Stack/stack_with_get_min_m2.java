package DSA_Stack;
import java.util.ArrayDeque;
//handles -ve numbers
public class stack_with_get_min_m2 {
    public static ArrayDeque<Integer> stack = new ArrayDeque<>();
    public static int min;
    public static void push(int x){
        if(stack.isEmpty()){
            stack.push(x);
            min = x;
        }
        else if(x <= min){
            stack.push(2*x - min);
            min = x;
        }
        else{
            stack.push(x);
        }
    }
    public static void pop(){
        if(stack.isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        else if(stack.peek() <= min){
            min = 2*min - stack.pop();
        }
        else{
            stack.pop();
        }
    }
    public static void peek(){
        int t = stack.peek();
        System.out.println("peek:"+(t<=min ? min:t));
    }
    public static void getmin(){
        System.out.println(min);
    }
    public static void getstack(){
        System.out.println(stack);
    }
    public static void main(String[] args) {
        push(5);
        getmin();
        push(8);
        push(10);
        push(2);
        push(6);
        getmin();
        getstack();
        pop();
        pop();
        getmin();
        push(1);
        push(4);
        push(2);
        pop();
        getmin();
    }
}
