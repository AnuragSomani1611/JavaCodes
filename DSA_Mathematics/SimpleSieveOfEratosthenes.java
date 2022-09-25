package DSA_Mathematics;
public class SimpleSieveOfEratosthenes {
    public static boolean isPrimeOptimal(int n){
        if(n <= 1){
            return false;
        }
        if(n == 2 || n == 3){
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0){
            return false;
        }
        for(int i = 5; i * i <= n; i+=6){
            if(n % i == 0 || n % (i+2) == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 39;
        boolean []arr = new boolean[n+1];
        for(int i = 2; i < arr.length; i++){
            arr[i] = true;
        }
        // O(n log log n) approach
        for(int i = 2; i <= n; i++){
            if(arr[i]){
                System.out.println(i);
                // still didn't understood that why we wrote j = i*i
                for(int j = i*i; j <= n; j += i){
                    arr[j] = false;
                }
            }
        }
        // O(n * n^1/2) approach
//        for(int i = 2; i*i <= n; i++){
//            if(arr[i]){
//                for(int j = 2*i; j <= n; j += i){
//                    arr[j] = false;
//                }
//            }
//        }
//        for(int i = 0; i <= n; i++){
//            if(arr[i]){
//                System.out.println(i);
//            }
//        }
    }
}
