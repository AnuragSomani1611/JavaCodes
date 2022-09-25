package DSA_BitMagic;

import java.util.Scanner;
// TC = O(1)
// lookup table method for 32 bit number
public class Count_Set_Bits_Optimised {
    public static int []table = new int[256];
    public static void initialize(){
        table[0] = 0;
        for(int i = 1; i < 256; i++){
            table[i] = (i & 1) + table[i/2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initialize();
        int n = sc.nextInt();
        int res = table[n];
        n = n >> 8;
        res = res + table[n];
        n = n >> 8;
        res = res + table[n];
        n = n >> 8;
        res = res + table[n];
        System.out.println(res);
//        for(int i = 0; i < table.length; i++){
//            System.out.println(table[i]);
//        }
    }
}
