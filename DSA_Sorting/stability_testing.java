package DSA_Sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//stable sorts - bubble, insertion, merge
//unstable sorts - selection, quick, heap
class stable {
    String x;
    int y;
    stable(String x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "{" + x + "," + y + "}";
    }
}
class MyCmpTesting implements Comparator<stable>{
    public int compare(stable p1, stable p2){
        if(p1.y == p2.y){
            return (p2.x).compareTo(p1.x);
        }
        return p2.y-p1.y;
    }
}
class MyCmpForNamesTesting implements Comparator<stable>{
    public int compare(stable p1, stable p2){
        return (p1.x).compareTo(p2.x);
    }
}
class MyCmpForRegTesting implements Comparator<stable>{
    public int compare(stable p1, stable p2){
        return p1.y-p2.y;
    }
}
public class stability_testing {
    public static void main(String[] args) {
        List<stable> l = new ArrayList<>();
        l.add(new stable("Anurag", 90));
        l.add(new stable("Vikanksh", 24));
        l.add(new stable("Vasu",88));
        l.add(new stable("Vishesh",90));
        l.add(new stable("Yugant",88));
        l.add(new stable("Ak", 75));
        Collections.sort(l, (a,b) -> b.y - a.y);
        System.out.println(l);
        Collections.sort(l, (p1,p2) -> (p2.x).compareTo(p1.x));
        System.out.println(l);
        Collections.sort(l, new MyCmpForRegTesting());
        System.out.println(l);
        Collections.sort(l, new MyCmpForNamesTesting());
        System.out.println(l);
        Collections.sort(l, new MyCmpTesting());
        System.out.println(l);
    }
}
