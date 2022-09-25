package DemoProgs;
import java.util.*;

public class Prog1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("aaabbaaa");
        char[] c = new char[(str.length()/2) + 1];
        String nS = "";
        if(str.length()%2==0){
            c = str.substring(0, (str.length()/2)).toCharArray();
            nS = str.substring(str.length()/2);
        }
        else {
            c = str.substring(0, (str.length() / 2) + 1).toCharArray();
            nS = str.substring((str.length() / 2) + 1);
        }
        char[] c1 = c;
        TreeSet<Character> ts = new TreeSet<>();
        for(int i = 0; i<c.length; i++){
            ts.add(c[i]);
        }
        ArrayList<String> al = new ArrayList<>();
        Character rep = ts.first();
        char[] temp = c;
        Iterator<Character> tsit = ts.iterator();
        int i = 0;
        tsit.next();
        while(tsit.hasNext()){
            if(c[i]<=rep){
                continue;
            }
            else {
                c[i] = rep;
                al.add(String.valueOf(c) + nS);
                c = c1;
            }
            i++;
            if(i==c.length-1){
                i = 0;
                rep = tsit.next();
            }
        }
        Collections.sort(al);
        StringBuilder temp1 = new StringBuilder(al.get(0));
        StringBuilder temp2 = new StringBuilder(temp1.reverse());
        if(temp1.equals(temp2)){
            System.out.println("IMMPOSSIBLE");
        }
        else{
            System.out.println(al.get(0));
        }
    }
}
