package DSA_Mathematics;
// O(log n) approach
public class ComputePower {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int temp = power(x, n/2);
        temp = temp * temp;
        if(n%2 == 0){
            return temp;
        }
        else
            return temp * x;
    }
    public static void main(String[] args) {
        int x = 8;
        int n = 8;
        System.out.println(power(x, n));
    }
}
