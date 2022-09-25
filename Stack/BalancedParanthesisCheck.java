//great code great logic you don't remember this
package Stack;
import java.util.Stack;
public class BalancedParanthesisCheck {
    public static void main(String[] args) {
        String s = "{()[]}()(({}))";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    System.out.println(false);
                    break;
                }
                else if(!isMatching(stack.peek(), c)){
                    System.out.println(false);
                    break;
                }
                else{
                    stack.pop();
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
    public static boolean isMatching(char a, char b){
        return  (  (a == '(' && b == ')')
                || (a == '{' && b == '}')
                || (a == '[' && b == ']')
                );
    }
}
