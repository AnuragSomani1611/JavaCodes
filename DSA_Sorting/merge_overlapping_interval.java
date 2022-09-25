package DSA_Sorting;

import java.util.Arrays;
import java.util.Comparator;

class interval{
    int start, end;
    interval(int start, int end){
        this.end = end;
        this.start = start;
    }

    @Override
    public String toString() {
        return "(" + start + "," + end + ")";
    }
}
class cmp implements Comparator<interval>{
    public int compare(interval a, interval b){
        return a.start - b.start;
    }
}
public class merge_overlapping_interval {
    public static void main(String[] args) {
        interval arr[] = {
                new interval(16, 19),
                new interval(2,3),
                new interval(5,8),
                new interval(4,7),
                new interval(7, 15)
        };
        Arrays.sort(arr, new cmp());
        int s = arr[0].start, e = arr[0].end;
        for(int i = 1; i < arr.length; i++){
            if(arr[i].start > e){
                System.out.println(s + " " + e);
                s = arr[i].start;
                e = arr[i].end;
            }
            else{
                e = Math.max(e, arr[i].end);
            }
        }
        System.out.println(s + " " + e);
        //System.out.println(Arrays.toString(arr));
    }
}
