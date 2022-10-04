package DSA_Strings;

public class sequence_in_string {
    public static void main(String[] args) {
        String s = "anuragsomani";
        String p = "ragso";
        int i = 0, j = 0;
        while(i < s.length() && j < p.length()){
            if(s.charAt(i) == p.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
            System.out.println(i + " " + j);
        }
        if(j == p.length()){
            System.out.println("yes");
        }

    }
}
