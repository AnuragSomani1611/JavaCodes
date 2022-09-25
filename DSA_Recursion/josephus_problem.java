package DSA_Recursion;

public class josephus_problem {
    public static int remianing(int n, int k){
        if(n == 1){
            return 0;
        }
        return (remianing(n-1, k) + k)%n;
    }

    public static void main(String[] args) {
        System.out.println(remianing(7,3));
    }
}
