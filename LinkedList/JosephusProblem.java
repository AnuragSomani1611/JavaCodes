package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class JosephusProblem {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        int n = 7;
        int k = 3;
        for(int i = 0; i < n; i++){
            ll.add(i+1);
        }
        Iterator<Integer> it = ll.iterator();
        while(ll.size()>1){
            int count = 0;
            while(count<k){
                while(it.hasNext() && count<k){
                    it.next();
                    count++;
                }
                if(count<k){
                    it = ll.iterator();
                    count++;
                    it.next();
                }
            }
            it.remove();
        }
        System.out.println(ll.getFirst());
    }
}
