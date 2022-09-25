package DSA_Recursion;

public class generate_subsets {
    public static void subsets(String s, int i, String curr){
        if(i == s.length()){
            System.out.println(curr);
            return;
        }
        subsets(s, i+1, curr);
        subsets(s, i+1, curr+s.charAt(i));
    }
    public static void main(String[] args) {
        subsets("ABC", 0, "");
    }
}
