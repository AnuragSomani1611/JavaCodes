package Strings;

public class anagramCheck {
    public static void main(String[] args) {
        String s1 = new String("anurag");
        String s2 = new String("raganu");
        if(s1.length() != s2.length()){
            System.out.println();
        }
        int res = 0;
        for(int i = 0; i < s1.length(); i++){
            res = res ^ s1.charAt(i) ^ s2.charAt(i);
        }
        if(res != 0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes they are pana");
        }
        //String[] names = example.split("[;:-]");
    }
}
