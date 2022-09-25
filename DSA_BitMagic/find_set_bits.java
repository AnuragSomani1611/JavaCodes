package DSA_BitMagic;

import java.util.Scanner;

public class find_set_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
//            if((n & 1) == 1){
//                count++;
//            }
            count = count + (n & 1);
            n = n >> 1;
        }
        System.out.println(count);
    }
}
