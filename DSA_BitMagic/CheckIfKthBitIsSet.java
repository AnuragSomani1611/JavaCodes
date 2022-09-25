package DSA_BitMagic;
import java.util.Scanner;
public class CheckIfKthBitIsSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        //left shift
        if((n & (1 << (k-1))) != 0){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
        //right shift
        if(((n>>(k-1)) & 1) == 0){
            System.out.println("No");
        }
        else
            System.out.println("Yes");
    }
}
