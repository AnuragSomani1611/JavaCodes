package DSA_Stack;
import java.util.ArrayDeque;
public class evaluation_of_postfix {
    public static int res(int o1, int o2, String s){
        switch (s){
            case "*":
                return o1*o2;
            case "/":
                return o1/o2;
            case "^":
                return (int)Math.pow(o1,o2);
            case "+":
                return o1+o2;
            case "-":
                return o1-o2;
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] arr =
        //{"10", "2", "*", "3", "5", "*", "+", "9", "-"};
        {"10", "2", "3", "^", "^"};
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String s : arr) {
            if (Character.isDigit(s.charAt(0))) {
                stack.push(s);
            }
            else {
                int o1 = Integer.parseInt(stack.pop());
                int o2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(res(o2, o1, s)));
            }
        }
        System.out.println(stack.peek());
    }
}
