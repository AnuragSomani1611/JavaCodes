package DSA_Mathematics;
public class OptimisedEucledianGCD {
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else
            return gcd(b, a % b);
    }
    public static void main(String[] args) {
        int a = 13, b = 39;
        System.out.println("gcd = " + gcd(a, b));
        System.out.println("lcm = " + (a*b)/gcd(a,b));
    }
}
