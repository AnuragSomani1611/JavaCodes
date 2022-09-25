package DemoProgs;

public class XORsum {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,8};
        int sum = arr[0];
        int res = arr[0];

        for(int i = 1; i < arr.length; i++){
            res ^= arr[i];
            sum += res;
        }
        for(int i = 0; i < arr.length; i++){
            res ^= arr[i];
            sum += res;
        }
        System.out.println(sum);
    }
}
