package Strings;
import java.util.*;
public class pangramCheck {
    public static void main(String[] args) {
        String sc = new String("the quick brown fox jumps over the lazy dog");
        sc = sc.replace(" ", "");
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0;
        while(sc.length() > 26 && hm.size()<=26 && i < sc.length()){
            hm.put(sc.charAt(i), hm.getOrDefault(sc.charAt(i), 0)+1);
            i++;
        }
        if(hm.size()==26){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
     }
}
