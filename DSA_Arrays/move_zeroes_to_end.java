package DSA_Arrays;
import java.util.Arrays;
public class move_zeroes_to_end {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0};
        int res = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != 0){
                arr[res] = arr[i];
                res++;
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
