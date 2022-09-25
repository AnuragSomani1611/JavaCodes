package DSA_Sorting;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
class Point implements Comparable<Point>{
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(Point p){
        return this.x - p.x;
    }

    @Override
    public String toString() {
        return "{" + x + " " + y + "}";
    }
}
class MyPoint{
    int x,y;
    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "{"+ x + "," + y+ "}";
    }
}
class MyCmp implements Comparator<MyPoint> {
    public int compare(MyPoint p1, MyPoint p2) {
        return p1.y - p2.y;
    }
}
class MyCmp1 implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        return a%2 - b%2;
    }
}
//Arrays.sort for non-primitive type uses dual pivot quick sort
//Arrays.sort and Collections.sort for primitive type (obj, Integer, Character) uses merge sort adaption of tim sort
public class sorting_in_arrays {
    public static void main(String[] args) {
        int []arr = {5, 30, 20, 10, 8};
        Arrays.sort(arr, 2, 4);
        System.out.println(Arrays.toString(arr));
        Point arr1[] = {new Point(10,20), new Point(3,12), new Point(5,7)};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        MyPoint arr2[] = {new MyPoint(10,20), new MyPoint(3,12), new MyPoint(5,7)};
        Arrays.sort(arr2, new MyCmp());
        System.out.println(Arrays.toString(arr2));
        Integer arr3[] = {7, 2, 10, 6, 15, 5, 12};
        Arrays.sort(arr3, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3, new MyCmp1());
        System.out.println(Arrays.toString(arr3));
    }
}
