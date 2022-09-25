package DemoProgs;

import java.util.ArrayList;
import java.util.Collections;

public class jabha {
    public static void main(String[] args) {
        ArrayList<Integer> B = new ArrayList<>();
        int A = 10;
        Collections.sort(B);
        int res = 0;
        int temp;
        for(int i = 0; i < A; i++){
            temp = B.get(i) * (A * i);
            if(temp > res){
                res = temp;
            }
        }
    }

}
