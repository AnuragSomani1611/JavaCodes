package DSA_Stack;

import java.util.ArrayDeque;

public class infix_to_postfix {
    static int prec(char c)
    {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }
    public static void main(String[] args) {
        String s = "a+b/c-d*e";
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                System.out.print(c);
            }
            else if(c == '('){
                stack.push(c);
            }
            else if(c == ')'){
                while(stack.peek().equals('(')) {
                    System.out.println(stack.pop());
                }
                stack.pop();
            }
            else{
                if(stack.isEmpty()){
                    stack.push(c);
                }
                else{
                    while (!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
                        if (c == '^' && stack.peek() == '^')
                            break;
                        else {
                            System.out.print(stack.pop());
                            stack.pop();
                        }
                    }
                    stack.push(c);
                }
//                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
