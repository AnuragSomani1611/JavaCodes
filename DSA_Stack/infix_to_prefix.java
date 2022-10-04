package DSA_Stack;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class infix_to_prefix {
    static int pres(char c){
        if(c == '^'){
            return 3;
        }
        else if(c == '/' || c == '*'){
            return 2;
        }
        else if(c == '+' || c == '-') {
            return 1;
        }
        else return -1;
    }
    public static void main(String[] args) {
        String s = "a+b*c";
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(pres(c) == -1){
                System.out.print(c);
            } else if(c == '(') {
                stack.push(c);
            } else if(c == ')') {
                while(stack.peek() != '('){
                    System.out.print(stack.pop());
                }
                stack.pop();
            }
            else{
                if(stack.isEmpty()){
                    stack.push(c);
                }
                else{
                    while (!stack.isEmpty() && pres(c) >= pres(stack.peek())) {
                        if (c == '^' && stack.peek() == '^')
                            break;
                        else {
                            System.out.print(stack.pop());
                        }
                    }
                    stack.push(c);
                }
//                stack.push(c);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
