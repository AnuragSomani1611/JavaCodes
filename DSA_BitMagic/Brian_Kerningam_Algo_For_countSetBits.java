package DSA_BitMagic;
import java.util.Scanner;
//O(no. of set bits)
public class Brian_Kerningam_Algo_For_countSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            n = (n & (n-1));
            count++;
        }
        System.out.println(count);
    }
}
