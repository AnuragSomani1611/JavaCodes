package DSA_BitMagic;

import java.util.Scanner;

// method 1 - simple naive by seeing if n is exactly divisible by 2
// method 2 - brian kerningam algo
// method 3
public class power_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n != 0) && (n & (n-1)) == 0);
//        if(n == 0){
//            System.out.println(false);
//        }
//        else
//            System.out.println((n & (n-1)) == 0);
    }
}
