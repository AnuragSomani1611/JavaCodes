package DSA_Queue_and_Deque;

public class first_circular_tour {
    public static void main(String[] args) {
        int [] fuel = {50, 10, 60, 100};
        int [] dist = {30, 20, 100, 10};
        int prev_fuel = 0;
        int curr_fuel = 0;
        int start = 0;
        for(int i = 0; i < fuel.length; i++){
            curr_fuel += fuel[i] - dist[i];
            if(curr_fuel < 0){
                start = i+1;
                prev_fuel += curr_fuel;
                curr_fuel = 0;
            }
        }
        System.out.println(curr_fuel+prev_fuel >= 0 ? start+1 : -1);
    }
}
