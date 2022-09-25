package DSA_Recursion;

public class sum_of_digits {
    public static int sumDigits(int n){
        if(n <= 9){
            return  n;
        }
        return n%10 + sumDigits(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }
}
