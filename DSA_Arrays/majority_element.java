package DSA_Arrays;

public class majority_element {
    public static void main(String[] args) {
        int[] arr = {30, 20, 30, 60, 70, 30, 30};
        int res = 0;
        int count = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[res] == arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                res = i;
                count = 1;
            }
        }
        count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == arr[res]){
                count++;
            }
        }
        if(count < arr.length/2){
            res = -1;
        }
        System.out.println(res);
    }
}
