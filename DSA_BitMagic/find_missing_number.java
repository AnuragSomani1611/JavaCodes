package DSA_BitMagic;
// incomplete solution
public class find_missing_number {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4};
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            res = res ^ i ^ arr[i];
        }
        System.out.println(res);
    }
}
