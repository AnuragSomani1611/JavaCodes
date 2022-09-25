package Queue;
import java.util.ArrayDeque;
import java.util.Deque;
public class GenerateNumbersWithGivenDigits {
    public static void main(String[] args) {
        int n = 5;
        Deque<String> queue = new ArrayDeque<>();
        queue.add("5");
        queue.add("6");
        for(int i = 0; i < n; i++){
            String temp = queue.poll();
            System.out.println(temp);
            queue.offer(temp + "5");
            queue.offer(temp + "6");
        }
    }
}
