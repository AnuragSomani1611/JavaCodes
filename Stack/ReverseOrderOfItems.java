package Stack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ReverseOrderOfItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            stack.push(sc.nextInt());
        }
        Iterator<Integer> it = stack.iterator();
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        // for storing we can use list.set(i, stack.pop());
    }
}
