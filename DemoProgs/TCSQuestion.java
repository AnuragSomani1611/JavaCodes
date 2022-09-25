package DemoProgs;

import java.util.*;

public class TCSQuestion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }

        int t = 0;

        for(int i=0; i<n; i++){
            if((n-1-i) <= arr[i]){
                t++;
                break;
            }
            int maxt = arr[i];
            int maxi = 0;
            int maxd = -1;
            for(int j=i+1; j<i+1+maxt; j++){
                if(maxd < (j+arr[j])){
                    maxd = j+arr[j];
                    maxi = j;
                }
            }
            i=maxi-1;
            t++;
        }
        System.out.println(t);
    }
}
//        package DemoProgs;
//                import java.util.*;
//public class TCSQ1 {
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int[] arr = new int[n];
//    for(int i = 0; i < n; i++){
//        arr[i] = sc.nextInt();
//    }
//    int count = 0;
//    int start = arr[0];
//    int i = 0;
//    while(n>0){
//        if(arr[i] == 1 && n>0){
//            n--;
//            i++;
//            count++;
//            start = i;
//        }
//        else if(arr[i]>1 && n>0){
//            ArrayList<Integer> al = new ArrayList<>(Arrays.asList(Arrays.copyOfRange(arr, start, start+arr[i]))));
//            start = arr.indexOf(Collections.max(al));
//
//        }
//    }
//}



