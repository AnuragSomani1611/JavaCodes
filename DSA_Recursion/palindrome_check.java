package DSA_Recursion;

public class palindrome_check {
    public static boolean check(String s, int start, int end){
        if(start >= end){
            return true;
        }
        return (s.charAt(start) == s.charAt(end)) && check(s, start+1, end-1);
    }

    public static void main(String[] args) {
        System.out.println(check("anurag", 0, "anurag".length()-1));
    }
}
