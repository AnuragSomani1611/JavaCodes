package DSA_Mathematics;

public class divisorsOfANumber {
    public static void printDivisors(int n){
        for(int i = 1; i*i < n; i++){
            if(n%i == 0){
                System.out.println(i);
                if(i != n/i){
                    System.out.println(n/i);
                }
            }
        }
    }
    public static void sortedDivisors(int n){
        int i ;
        for(i = 1; i*i < n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
        for(; i > 0; i--){
            if(n%i == 0){
                System.out.println(n/i);
            }
        }
    }
    public static void main(String[] args) {
        int n = 80;
        printDivisors(n);
        sortedDivisors(n);
    }
}
