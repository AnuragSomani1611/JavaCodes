package DSA_Arrays;
public class leaders_in_an_array {
    public static void main(String[] args) {
        int[] arr = {90, 20, 83, 45, 75, 50, 60};
        int n = arr.length;
        int res = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            if(arr[i] > res){
                System.out.println(res);
                res = arr[i];
            }
        }
        System.out.println(res);
    }
}
