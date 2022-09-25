package DSA_BitMagic;

public class odd_occuring_multiple_numbers {
    public static void main(String[] args) {
        int []arr = {3, 3, 3, 4, 4, 5, 5, 5, 6, 6};
        int res1 = 0, res2 = 0, n = arr.length;
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor = xor ^ arr[i];
        }
        int sn = xor & (~(xor-1));
        for(int i = 0; i < n; i++){
            if((arr[i] & sn) != 0){
                res1 = res1 ^ arr[i];
            }
            else
                res2 = res2 ^ arr[i];
        }
        System.out.println(res1 + " " + res2);
    }
}
