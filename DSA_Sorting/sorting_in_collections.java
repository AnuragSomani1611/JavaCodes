package DSA_Sorting;

import java.util.*;

public class sorting_in_collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(6);
        list.add(7);
        list.add(5);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        List<Point> l = new ArrayList<>();
        l.add(new Point(5,15));
        l.add(new Point(2,10));
        l.add(new Point(10, 6));
        //sorting on the basis of x coordinate
        Collections.sort(l);
        System.out.println(l);
        List<MyPoint> l1 = new ArrayList<>();
        l1.add(new MyPoint(5,15));
        l1.add(new MyPoint(2,10));
        l1.add(new MyPoint(10, 6));
        Collections.sort(l1, new MyCmp());
        System.out.println(l1);
    }
}
