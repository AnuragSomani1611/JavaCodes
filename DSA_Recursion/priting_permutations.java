package DSA_Recursion;

public class priting_permutations {
    public static String swap(int i, int j, String a){
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static void permute(String s, int i){
        if(i == s.length()){
            System.out.println(s);
            return;
        }
        for(int j = i; j < s.length(); j++){
            s = swap(i, j, s);
            permute(s, i+1);
            s = swap(i, j , s);
        }
    }

    public static void main(String[] args) {

        permute("ABC", 0);
    }
}
