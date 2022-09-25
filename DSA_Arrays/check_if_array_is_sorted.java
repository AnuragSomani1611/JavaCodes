package DSA_Arrays;

public class check_if_array_is_sorted {
    public static void main(String[] args) {
        int[] arr = {10, 20, 33, 45, 35, 50, 60};
        boolean flag = true;
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] > arr[i]){
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
