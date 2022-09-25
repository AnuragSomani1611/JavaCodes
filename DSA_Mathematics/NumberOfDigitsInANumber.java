package DSA_Mathematics;

import java.util.Scanner;

public class NumberOfDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 89765;
        System.out.println((int) (Math.log10(n) + 1)); // fastest
        // 2 more methods
        // res * 10 + rem
        // num % 10
    }
}
