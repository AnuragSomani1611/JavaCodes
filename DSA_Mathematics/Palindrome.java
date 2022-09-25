package DSA_Mathematics;
// good logic
public class Palindrome {
    public static void main(String[] args) {
        int n = 475574;
        int rev = 0, temp = n;
        while(temp!=0){
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }
        System.out.println(rev == n);
    }
}
